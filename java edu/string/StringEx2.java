class StringEx2 {
	public static void main(String[] args) {
		String file1 = "test.jpg";	String file2 = "test.gif";
		String file3 = "test.zip";	String file4 = "test.doc";

		imgFile(file1);	imgFile(file2);	imgFile(file3);	imgFile(file4);
	}
	public static void imgFile(String file) {
		/* �޾ƿ� ���ϸ� ���ڿ��� �̿��Ͽ� �̹��� �������� �˻��� �� ����ϴ� �޼ҵ�
		1. �޾ƿ� ���ϸ��� Ȯ���ڸ� �˻�
			1-1. ���ϸ��� Ȯ���� �κи� ����
			 - ��(������ ��) ���� ���ں��� ������ �߶�� : ������ ��(lastIndexOf()), �ڸ�(substring ())
			1-2. ������ Ȯ���ڰ� �̹��� ������ Ȯ���ڵ�� �������� �˻� �� ���
			 - �̹��� ������ Ȯ���� : jpg, gif, png, jpeg ��� ��
		*/

		int dot = file.lastIndexOf('.');		// file ���ڿ����� ������ ���� ��ġ�� dot�� ����
		String ext = file.substring(dot + 1);	// file ���ڿ��� ������ ���� ��ġ ���� ���ں��� ������ �߶��

		if (ext.equals("jpg") || ext.equals("gif") || ext.equals("png") || ext.equals("jpeg")){
			System.out.println(file + "��(��) �̹��� ������ �½��ϴ�.");
		} else {
			System.out.println(file + "��(��) �̹��� ������ �ƴմϴ�.");
		}
	}
}
