// Lab12av100.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.Scanner;
import java.util.ArrayList;

public class Lab12av100
{
    public static void main(String[] args)
    {
        MagpieLab12a maggie = new MagpieLab12a();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}


class MagpieLab12a
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("family") >= 0
                || statement.indexOf("parent") >= 0
                || statement.indexOf("brother") >= 0)
        {
            String responses[] = { "Tell me more about your family.",
                                   "Say more to me about your family.",
                                   "What is your family like?",
                                   "How big is your family?",
                                   "Are there any pets in your family?",
                                   "Share something about your family with me.",
                                   "Tell me about your family.",
                                   "I want to hear about your family.",
                                   "Do you have a big family?",
                                   "Tell me something about your family." };
            ArrayList<String> responseslist = new ArrayList<String>();
            for (String e : responses) { responseslist.add(e); }
            int length = responseslist.size();
            response = responseslist.get((int) (Math.random() * length));
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse()
    {
        String response = "";
        String responses[] = { "Swag.",
                               "Bruh.",
                               "Huh?",
                               "Sure..",
                               "😂👌💯🔥🔥",
                               "wut",
                               "Dope.",
                               "K",
                               "??",
                               "Follow dank_nissan on twitch.tv please." };
        int length = responses.length;
        response = responses[(int) (Math.random() * length)];
        return response;
    }
}
