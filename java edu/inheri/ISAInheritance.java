class Computer {
	String owner;
	public Computer(String name) { owner = name; }
	public void calculate() { System.out.println("��û ������ ó���մϴ�."); }
}

class Notebook extends Computer {	// Notebook is a Computer(Notebook�� ������ Computer�̴�)
	// Computer Ŭ������ ��ӹ������ν� ComputerŬ������ ���(���)���� �⺻������ ���߰� �ִ� NotebookŬ������ ��
	int battery;
	public Notebook(String name, int chag) {
		super(name);
		battery = chag;
	}
	public void charging() { battery += 5; }
	public void movingCal() {
		if (battery < 1) {
			System.out.println("������ �ʿ��մϴ�.");
			return;
		}
		System.out.print("�̵��ϸ鼭 ");
		calculate();
		battery--;
	}
}

class TabletNote extends Notebook {
	// Computer�� ��ӹ��� Notebook�� ��ӹ޾����Ƿ� Computer�� NotebookŬ������ ����� �⺻������ ���߰� ����
	String pen;
	public TabletNote(String name, int chag, String pen) {
		super(name, chag);
		this.pen = pen;
	}
	public void write(String penInfo) {
		if (battery < 1) {
			System.out.println("������ �ʿ��մϴ�.");
			return;
		}
		if (!pen.equals(penInfo)) {
			System.out.println("��ϵ� ���� �ƴմϴ�.");
			return;
		}
		System.out.print("�ʱ� ����� ");
		calculate();
		battery--;
	}
}
class ISAInheritance {
	public static void main(String[] args) {
		Notebook nb = new Notebook("ȫ�浿", 5);
		TabletNote tn = new TabletNote("����ġ", 5, "ISE-123-456");

		nb.movingCal();
		tn.write("ISE-123-456");
	}
}
