package qk1011.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * java ³Ö¾Ã»¯
 */
public class StudentPersistent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jerry = new Student("jerry", "Male", 20);
		System.out.println("Original Student object:" + jerry);
		persist(jerry);

		Student jerry2 = load();
		System.out.println("Persisted Student object:" + jerry2);
	}

	private static void persist(Student student) {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("student.output"));
			oos.writeObject(student);
			oos.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	private static Student load() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("student.output"));

			return (Student) ois.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;

	}
}
