What is Java? 

Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language. Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java. Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform. 

Java Example Let's have a quick look at Java programming example. A detailed description of Hello Java example is available in next page. 
Simple.java 
class Simple{ 
    public static void main(String args[]){
         System.out.println("Hello Java");
          } 
          } 
          Test it Now Application According to Sun, 3 billion devices run Java. There are many devices where Java is currently used. Some of them are as follows: Desktop Applications such as acrobat reader, media player, antivirus, etc. Web Applications such as irctc.co.in, javatpoint.com, etc. Enterprise Applications such as banking applications. Mobile Embedded System Smart Card Robotics Games, etc. 
          ---------------------------------------------------------------------- 
          Types of Java Applications There are mainly 4 types of applications that can be created using Java programming: 
          1) Standalone Application Standalone applications are also known as desktop applications or window-based applications. These are traditional software that we need to install on every machine. Examples of standalone application are Media player, antivirus, etc. AWT and Swing are used in Java for creating standalone applications. 
          
          2) Web Application An application that runs on the server side and creates a dynamic page is called a web application. Currently, Servlet, JSP, Struts, Spring, Hibernate, JSF, etc. technologies are used for creating web applications in Java. 
          
          3) Enterprise Application An application that is distributed in nature, such as banking applications, etc. is called an enterprise application. It has advantages like high-level security, load balancing, and clustering. In Java, EJB is used for creating enterprise applications. 
          
          4) Mobile Application An application which is created for mobile devices is called a mobile application. Currently, Android and Java ME are used for creating mobile applications. Java Platforms / Editions There are 4 platforms or editions of Java: 
          
          1) Java SE (Java Standard Edition) It is a Java programming platform. It includes Java programming APIs such as java.lang, java.io, java.net, java.util, java.sql, java.math etc. It includes core topics like OOPs, String, Regex, Exception, Inner classes, Multithreading, I/O Stream, Networking, AWT, Swing, Reflection, Collection, etc. 
          
          2) Java EE (Java Enterprise Edition) It is an enterprise platform that is mainly used to develop web and enterprise applications. It is built on top of the Java SE platform. It includes topics like Servlet, JSP, Web Services, EJB, JPA, etc. 
          
          3) Java ME (Java Micro Edition) It is a micro platform that is dedicated to mobile applications. 
          
          4) JavaFX It is used to develop rich internet applications. It uses a lightweight user interface API. 
          
          ------------------------------------------------------------------------ 
          
          Prerequisite To learn Java, you must have the basic knowledge of C/C++ programming language. -------------------------------------------------------------------------------------------------------------------------------- Java is a platform independent language because the code of java write once and run everywhere. 
          
          Let's explain terminology:- Compilation Process:- Compiler(JDK) is a translator which converts the human readbale code into the machine code so compiler converts our source code(.java) into the byte code(.class)...So because of this functionality we can run the java code in any of the system which has JRE means JDK installed on his computer...so that's why java is portable language we can run our apps which is actually made by java in any of the systems. 
          
          Execution Process:- So Our Byte code then finally convert into the native code(machine readable code - Binary code) through JVM. JDK -> JRE + Development Tools -> JRE -> JVM + Libraries ---------------------------------------------------------------------------------------------------------------------------- Variable is a container which is used to store some value. 
          ex- a=3; , b=5; , c=7; -> a , b and c are the variables which is used to store some values and these values are not constants it can be changed.. -----------------------------------------------------------------------------------------------------------------------------Data Types :- 
          1- Primitive 
          2- Non-primitive 
          
          Primitive Data Types:- 
          1 byte = 8 Bits 
          short- size - 2 byte 
          int-size- 4 byte...It is taking integer type values 
          long-size- 8 byte...It is taking the long integer values 
          float-size - 4 byte...It is taking the floating point values means decimal values 
          double-size- 8 byte...It is also taking the floating point values 
          char- 1 byte - taking Characters 
          byte- 1 byte = 8 bits 
          boolean- 1 byte True or false 
          
          Non-primitive Data types:- 
          String- 
          Array- 
          Class- 
          Object- 
          Interface- =============================================================================================================================In Coding there is no BODMAS here is priority of the operators:- (),*,/,%,-,+  -> So first priority will be parenthesis then multiply divide and so on...and our calculation will be go on left to right.. 
          
          -------------------------------------------------------------------------------------------------------- 
          Taking input from the user -