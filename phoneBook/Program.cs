using static System.Console;
using phoneBook.phoneBook;

Telephone t = new Telephone("+7(919) 345-46-54");
t.AddTelephone("+7(908) 345-67-25");
WriteLine(t.AddTelephone("+7(918) 345-67-25"));
WriteLine(t);
WriteLine(t.PhonesToFile());
WriteLine(t.Count);
WriteLine(new Telephone(t.Telephones));
Contact ct = new Contact("sdfdff", t);
ct.FullName = "sdfsdfas";
ct.Phone.AddTelephone("+7(952) 987-56-78");
WriteLine(ct);
WriteLine(ct);
