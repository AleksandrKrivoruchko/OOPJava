using System.Collections.Generic;

namespace phoneBook.bookIOFile
{
    public class ErrorConsole
    {
        public static void Message(List<string> strList)
        {
            PhoneConsoleOutput pCon = new PhoneConsoleOutput();
            foreach (string item in strList)
            {
                pCon.write(item);
            }

        }
    }
}