import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Resume {
    private String name;
    private String email;
    private String phone;
    private String education;
    private String workExperience;
    private String skills;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }


    public void saveToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName + ".txt")) {
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Phone: " + phone + "\n");
            writer.write("Education: " + education + "\n");
            writer.write("Work Experience: " + workExperience + "\n");
            writer.write("Skills: " + skills + "\n");

            System.out.println("Resume saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving resume: " + e.getMessage());
        }
    }
}

public class resumebuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your education: ");
        String education = scanner.nextLine();

        System.out.print("Enter your work experience: ");
        String workExperience = scanner.nextLine();

        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();
	
	

        Resume resume = new Resume();
        resume.setName(name);
        resume.setEmail(email);
        resume.setPhone(phone);
        resume.setEducation(education);
        resume.setWorkExperience(workExperience);
        resume.setSkills(skills);
        System.out.print("Enter the filename to save the resume: ");
        String fileName = scanner.nextLine();

        resume.saveToFile(fileName);

        scanner.close();
    }
}
