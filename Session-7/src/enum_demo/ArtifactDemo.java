package enum_demo;

public class ArtifactDemo {
	public static void main(String[] args) {
		Artifact a1 = new Artifact(Origin.AZTEC, Category.JEWEL, State.VERY_GOOD);
		Artifact a2 = new Artifact(Origin.EGYPTIAN, Category.RELIGIOUS_OBJECT, State.VERY_GOOD);
		Artifact a3 = new Artifact(Origin.GREEK, Category.UNKNOWN, State.BAD);

		Artifact[] artefacte = {a1, a2, a3};

		for (Artifact currentArtifact : artefacte) {
			if(currentArtifact.getState().getMark() == 4) {
				System.out.println(currentArtifact);
			}
		}
	}
}
