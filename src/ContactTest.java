import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import net.myinfosys.contact.enumeration.Religi;
import net.myinfosys.contact.enumeration.Sex;
import net.myinfosys.contact.enumeration.Skill;
import net.myinfosys.contact.pojo.Contact;
public class ContactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact contact1 = new Contact("Trump","Tarutung","11/12/2001",Religi.BUDHA,Sex.LAKI_LAKI,Skill.JAVA,"ruben@gmail.com","0821");
		Contact contact2 = new Contact("Hillary","Tarutung","11/12/2001",Religi.BUDHA,Sex.LAKI_LAKI,Skill.JAVA,"ruben@gmail.com","0821");
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		List<Contact> listContact = new ArrayList<Contact>(1);
		listContact.add(contact1);
		listContact.add(contact2);
		try{
			fos = new FileOutputStream("Contact.txt");
			os = new ObjectOutputStream(fos);
			for(Contact contact : listContact){
				System.out.println(contact.toString());
				os.writeObject(contact.toString());
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}
		
	}
}
