package Dom0829;

public class GlavniProgram {
	// Napisati glavni program koji ce imati bar tri studenta i dva profesora.
	public static void main(String[] args) {
		Student s1 = new Student("Branimr", "Gordic", 1990, 0204, 1, 4.5);
		Student s2 = new Student("Milos", "Sreckovic", 1990, 2454, 13, 5.5);
		Student s3 = new Student("Boban", "Gordic", 1993, 0204, 1, 4.5);
		Profesor p1 = new Profesor("Vlada", "Gordic", 1987, "Doktor");
		Profesor p2 = new Profesor("Dragan", "Golijanin", 1987, "Doktor");
		System.out.println(s1.ispisi2());
		System.out.println(s2.ispisi2());
		System.out.println(s3.ispisi2());
		
		System.out.println(p1.ispisi3());
		System.out.println(p2.ispisi3());
	}

}
