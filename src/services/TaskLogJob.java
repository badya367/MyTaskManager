package services;

import entities.Task;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskLogJob  {

    /*
    @method addNewTaskInLog
    Работает с тегами xml документа. Разбивает задачу по тегам и записывает в файл
     */
    public  void addNewTaskInLog(Task task) throws TransformerFactoryConfigurationError, DOMException, ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        // Создается дерево DOM документа из файла
        Document document = documentBuilder.parse("YourTaskLog.xml");

        // Получаем корневой элемент
        Node root = document.getDocumentElement();

        /*
        Создаем новую задачу по элементам
        */

        // Сама задача <entities.Task>
        Element taskElement = document.createElement("entities.Task");

        // <TaskName>- тег с названием задачи
        Element taskNameLog = document.createElement("TaskName");
        // Устанавливаем значение текста внутри тега
        taskNameLog.setTextContent(task.getTaskName());

        // <Description>- тег с описанием задачи
        Element descriptionLog = document.createElement("Description");
        descriptionLog.setTextContent(task.getDescription());
        // <Time>- тег с временем задачи
        Element timeLog = document.createElement("Time");
        timeLog.setTextContent(task.getTime() + "");
        // <Contacts>- тег с контактами
        Element contactsLog = document.createElement("Contacts");
        contactsLog.setTextContent(task.getContacts());


        // Добавляем внутренние элементы задачи в элемент <entities.Task>
        taskElement.appendChild(taskNameLog);
        taskElement.appendChild(descriptionLog);
        taskElement.appendChild(timeLog);
        taskElement.appendChild(contactsLog);

        // Добавляем задачу в корневой элемент
        root.appendChild(taskElement);

        // Записываем XML в файл
        writeDocument(document);
    }

    /*
    @method writeDocument
    Логика записи задачи в xml файл
     */
    public void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            tr.setOutputProperty(OutputKeys.METHOD, "xml");
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("other.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
