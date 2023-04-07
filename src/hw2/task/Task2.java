package hw2.task;

// Дана строка json:**
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:

public class Task2 {
    public static void parse(){
        String string =  "{{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}}";
        string = string.replace("{", "")
                .replace("}", "")
                .replace("\"", "")
                .replace(",", " ")
                .replace("фамилия", "")
                .replace("оценка", "")
                .replace("предмет", "")
                .replace(":", "");


        String[] array = string.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i+=3) {
            sb.append(" Студент ");
            sb.append(array[i]);
            sb.append(" Получил ");
            sb.append(array[i+1]);
            sb.append(" По предмету ");
            sb.append(array[i+2]);
            sb.append(".\n");
        }
        System.out.println(sb);
    }
}
