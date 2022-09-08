﻿using static System.Console;
using phoneBook.phoneBook;
using phoneBook.interfaceBoks;

Telephone t = new Telephone("+7(919) 345-46-54");
t.AddTelephone("+7(908) 345-67-25");
t.AddTelephone("+7(918) 345-67-25");
Contact ct = new Contact("sdf", t);
ct.FullName = "Семёнов Сергей Николаевич";
ct.Phone.AddTelephone("+7(952) 987-56-78");
// WriteLine(ct);
string[] len = { "+7(950) 988-34-56", "+7(932) 654-34-97" };
Contact ct1 = new Contact("Иванов Иван Иванович",
                          new Telephone(new List<string>(len)));
IPhoneBook phoneBook = new PhoneBookExt();
phoneBook.Add(ct);
phoneBook.Add(ct1);
WriteLine(phoneBook);
WriteLine("------------------------------------------");
WriteLine(((PhoneBookExt)phoneBook).SearchByTelephone("+7(932) 654-34-97"));
WriteLine("------------------------------------------");
WriteLine(ct.Phone.AddTelephone("+7(950) 988-34-56"));
WriteLine(ct);
phoneBook.Add(ct);
