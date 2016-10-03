package hello;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyBean
{
    public String modifyName(String name)
    {
        return "Modified "+name;
    }

    public int scale()
    {
        Random rand =new Random();
        return rand.nextInt(10);
    }

}
