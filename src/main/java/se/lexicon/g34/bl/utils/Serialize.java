package se.lexicon.g34.bl.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialize {
    public static <T> void serialize(List<T> list, String filePath) {
        try (
                FileOutputStream outStream = new FileOutputStream(filePath);
                ObjectOutputStream out = new ObjectOutputStream(outStream);
        ) {
            out.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> deSserialize(String filePath) {
        List<T> result=new ArrayList<>();
        try (
                FileInputStream inStream = new FileInputStream(filePath);
                ObjectInput in = new ObjectInputStream(inStream);
        ) {
            result = (List<T>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

}
