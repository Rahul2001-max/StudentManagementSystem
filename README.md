# StudentManagementSystem
A basic web app to manage student records. You can Create, Read, Update, Delete (CRUD) student data like name, email, age.


## 🚀 Features

- Add new student records
- View all students in a table
- Edit existing student details
- Delete students from the list
- Simple JSP UI with basic navigation

---

## 🧰 Tech Stack

| Layer          | Technology           |
|----------------|----------------------|
| Frontend       | JSP, HTML, CSS       |
| Backend        | Java (Struts 2 MVC)  |
| ORM            | Hibernate (XML-based)|
| Database       | MySQL                |
| Server         | Apache Tomcat        |
| IDE            | Eclipse (or any Java IDE) |

---

## 📂 Project Structure

<pre>
StudentManagement/
├── src/
│   ├── com.project.action        # Struts Actions
│   ├── com.project.dao           # DAO layer
│   ├── com.project.model         # POJO class (Student.java)
│   └── com.project.service       # Optional service layer
├── resources/
│   ├── hibernate.cfg.xml
│   └── Student.hbm.xml
├── WebContent/
│   ├── addStudent.jsp
│   ├── viewStudents.jsp
│   ├── editStudent.jsp
│   ├── success.jsp
│   ├── error.jsp
│   └── WEB-INF/
│       └── web.xml
├── struts.xml
</pre>


---

## ⚙️ Setup Instructions

1. **Clone this repository:**
   ```bash
   git clone https://github.com/yourusername/StudentManagement.git
2. Import into Eclipse:

   File → Import → Existing Projects into Workspace

3. Configure Database:

   Create a database named student_db

   Run the SQL script or let Hibernate auto-create the table

   Update DB credentials in hibernate.cfg.xml:

4. Deploy to Tomcat server and run the project

## Testing
Access app at: http://localhost:8080/StudentManagement/
Test all CRUD operations



## 📜 License
This project is open source and available under the MIT License.

