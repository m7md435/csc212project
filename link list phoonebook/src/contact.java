import java.util.Scanner;
public class contact implements comparable<contact> {
	private String contactname;
	private String phonenumber;
	private String email; 
	private String address; 
	private String birthday; 
	private String notes;
	public contact() {
		
	}
	public contact(String contactname, String phonenumber, String email, String address, String birthday,String notes) { 
      this.contactname= contactname;
      this.phonenumber= phonenumber;
      this.email= email; 
      this.address= address; 
      this.birthday= birthday;
      this.notes= notes; 
	}
      public contact(contact c) {
       this.contactname = c.contactname;
       this.phonenumber=c.phonenumber;
       this.email=c.email;
       this.address=c.address;
       this.birthday=c.birthday;
       this.notes=c.notes;
      }
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int compareto(contact c){
		return contactname.compareTo(c.contactname);
	}
	
	
}
