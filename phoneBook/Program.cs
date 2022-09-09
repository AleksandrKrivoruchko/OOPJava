using static System.Console;
using phoneBook.phoneBook;
using phoneBook.interfaceBoks;
using phoneBook.bookIOFile;

Telephone t = new Telephone("+7(919) 345-46-54");
t.AddTelephone("+7(908) 345-67-25");
t.AddTelephone("+7(918) 345-67-25");

Contact ct = new Contact("sdf", t);
ct.FullName = "Семёнов Сергей Николаевич";
ct.Phone.AddTelephone("+7(952) 987-56-78");

string[] arrayStr = { "+7(950) 988-34-56", "+7(932) 654-34-97" };
Contact ct1 = new Contact("Иванов Иван Иванович",
                          new Telephone(new List<string>(arrayStr)));

IPhoneBook phoneBook = new PhoneBookExt();
phoneBook.Add(ct);
phoneBook.Add(ct1);
Write(phoneBook);

IDataOutputHelper<IPhoneBook> fw = new PhoneFileOutput("bookPhone.txt");
fw.write(phoneBook);
IDataInputHelper fr = new PhoneFileInput("bookPhone.txt");
IPhoneBook pb = new PhoneBookExt();
fr.read(pb);
WriteLine("****************************************************");
Write(pb);
WriteLine("****************************************************");
Contact ct3 = new Contact("Олег", new Telephone("+7(950) 988-34-56"));
Contact ct4 = new Contact("Юрий", new Telephone("+7(936) 876-12-43"));
pb.Add(ct3);
pb.Add(ct4);

ct4.Phone.AddTelephone("+7(900) 123-12-13");
pb.Update(ct4);
WriteLine("----------------------------------------------------");
Write(pb);
