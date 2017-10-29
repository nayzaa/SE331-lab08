package camt.cbsd.lab05.config;

import camt.cbsd.lab05.dao.StudentDao;
import camt.cbsd.lab05.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "server")
@Component
public class DataLoader implements ApplicationRunner {
    StudentDao studentDao;
    @Autowired
    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }
    String baseUrl,imageUrl,imageBaseUrl;

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        imageBaseUrl = baseUrl + imageUrl;
        studentDao.addStudent(Student.builder().studentId("SE-001").name("Mitsuha").surname("Miyanizu").gpa(2.15).image(imageBaseUrl+"mitsuha.jpg").feature(true).penAmount(0).description("the most beloved one").build());
        studentDao.addStudent(Student.builder().studentId("SE-002").name("Prayuth").surname("The minister").gpa(3.59).image(imageBaseUrl+"tu.gif").feature(false).penAmount(0).description("the most beloved two").build());
        studentDao.addStudent(Student.builder().studentId("SE-003").name("Jurgen").surname("Kloop").gpa(2.15).image(imageBaseUrl+"Kloop.jpg").feature(true).penAmount(0).description("the most beloved three").build());

        Student student = new Student(1,"SE-001","Mitsuha","Miyanizu",2.15,imageBaseUrl+"mitsuha.gif",true,0,"the most bloved 1");
    }
}
