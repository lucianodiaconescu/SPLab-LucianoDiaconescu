package ro.uvt.info.splab;

<<<<<<< HEAD
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.splab.models.Paragraph;
import ro.uvt.info.splab.models.Section;
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
>>>>>>> 31d2bbb2f7a3266825d298c8f42808ac86f9438c

@SpringBootApplication
public class SplabApplication {

	public static void main(String[] args) {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
	//	p1.setAlignStrategy(new AlignCenter());
	//	p2.render(new AlignRight(p2, ));
	//	p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
	}
}
