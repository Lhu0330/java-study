package common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class FileUtil {
	private static File file = null;

	/**
	 * ���丮�� ������ ��ο� �̸��� �Է¹޾� File ��ü�� �����Ѵ�.
	 *
	 * @param String path   ���� Ȥ�� ���丮 ��ġ ���
	 * @param String name   ���� Ȥ�� ���丮��
	 * @return File
	 */
	public static File checkNull(String path, String name) throws Exception {
		try {
			/* ���丮�� ������ ��ο� �̸��� null���θ� üũ. ���ǿ� �´� File�� ���� */
			if (name == "")
				file = new File(path);
			else
				file = new File(path, name);
			return file;
		}
		catch (Exception ex) {
			System.out.println("FileUtil : checkNull()�� ���� �߻�");
		}
		return file;
	}

	/**
	 * ���� ��� ���丮 ��ġ�� ���ϸ����� �ش� ������ ������ �����Ѵ�.
	 *
	 * @param String filePath   ���� ��� ���� ��ġ ���
	 * @param String fileName   ���� ��� ���ϸ�
	 * @exception IOException
	 */
	public static void fileCreate(String filePath, String fileName) throws Exception {

		/* filePath�� ���丮 ���� */
		dirCreate(filePath);
		file = new File(filePath, fileName);

		try {
			/* �ش��ο� ������ �������� ������ ���ο� ������ ���� */
			if (!file.exists())
				file.createNewFile();
		}
		catch (IOException ioe) {
			System.out.println("FileUtil : fileCreate()�� ���� �߻�");
		}
	}

	/**
	 * ���� ��� ���丮 ��ġ�� ���丮������ �ش� ������ ���丮�� �����Ѵ�.
	 *
	 * @param String dirPath    ���� ��� ���丮 ��ġ ���
	 * @param String dirName    ���� ��� ���丮��
	 * @return void
	 */
	public static void dirCreate(String dirPath, String dirName) throws Exception {
		try {
			/* ������ null ���θ� üũ�� File ���� */
			file = checkNull(dirPath, dirName);

			/* �ش� ��ο� ���丮�� �������� ���� ��� ���丮 ���� */
			if (!file.isDirectory()) {
				//file.mkdir();
				file.mkdirs();
			}
		}
		catch (Exception ex) {
			System.out.println("FileUtil : dirCreate()�� ���� �߻�");
		}
	}

	/**
	 * ���� ��� ���丮 ��ġ�� �� ���丮�� �����Ѵ�.
	 *
	 * @param String dirPath    ���� ��� ���丮 ��ġ ���
	 * @return void
	 */
	public static void dirCreate(String dirPath) throws Exception {
		try {
			dirCreate(dirPath, "");
		}
		catch (Exception ex) {
			System.out.println("FileUtil : dirCreate()�� ���� �߻�");
		}
	}

	/**
	 * ���丮 Ȥ�� ������ �̸��� �����Ѵ�.
	 *
	 * @param String filePath       ���� ��� ���� ��ġ ���
	 * @param String fileOldName    ���� ��� ������ ���� �̸�
	 * @param String fileNewName    ���� ��� ������ �� �̸�
	 */
	public static void fileUpdate(String filePath, String fileOldName, String fileNewName) throws Exception {
		try {
			File oldFile = null;
			File newFile = null;

			/* ������ null ���θ� üũ�� File ���� */
			oldFile = checkNull(filePath, fileOldName);
			newFile = checkNull(filePath, fileNewName);

			/* �����̳� ���丮�� �̸��� ���� */
			if (oldFile.renameTo(newFile))
				System.out.println(filePath + "������ " + fileOldName + "������ " + fileNewName + "���Ϸ� �����Ǿ����ϴ�.");
		}
		catch (Exception ex) {
			System.out.println("FileUtil : fileUpdate()�� ���� �߻�");
		}
	}

	/**
	 * Ư�� ��ġ�� �����ϴ� ������ ���� ��ġ�� ���丮�� �����Ѵ�.
	 *
	 * @param String dirOldPath     ���� ��� ������ ���� ���丮 ��ġ ���
	 * @param String dirNewPath     ���� ��� ������ �� ���丮 ��ġ ���
	 * @param String fileName       ���� ��� ������ �̸�
	 * @exception IOException
	 */
	public static void fileCopy(String dirOldPath, String dirNewPath, String fileName) throws Exception {

		File in = null;
		File out = null;

		try {
			/* ������ null ���θ� üũ�� File ���� */
			in = checkNull(dirOldPath, fileName);
			out = checkNull(dirNewPath, "");
			
			if(in.exists()) {
				/* ���� ��� ���丮�� �������� ������ �ش� ��ο� ���丮 ���� */
				if (!out.isDirectory())
					out.mkdirs();
	
				/* ���� ��� ���丮�� ������ ���ϸ����� File���� */
				out = new File(dirNewPath, fileName);
	
				/* ���� ��� ������ ������ �о�鿩 ���� ��� ���丮�� ���� ���� */
				FileInputStream fis = new FileInputStream(in);
				FileOutputStream fos = new FileOutputStream(out);
	
				byte[] buf = new byte[10*1024];
				int i = 0;
	
				while ( (i = fis.read(buf)) != -1) {
					fos.write(buf, 0, i);
				}
	
				fis.close();
				fos.close();
			}
		}
		catch (IOException ioe) {
			System.out.println("FileUtil : fileCopy()�� ���� �߻�");
		}
	}

	/**
	 * Ư�� ��ġ�� �����ϴ� ������ ���� ��ġ�� ���丮�� ���ο� �̸����� �����Ѵ�.
	 *
	 * @param String dirOldPath     ���� ��� ������ ���� ���丮 ��ġ ���
	 * @param String dirNewPath     ���� ��� ������ �� ���丮 ��ġ ���
	 * @param String fileName       ���� ��� ������ �̸�
	 * @param String fileRename     ���� ��� ������ ���ο��̸� 
	 * @exception IOException
	 */
	public static void fileCopy(String dirOldPath, String dirNewPath, String fileName, String fileRename) throws Exception {

		File in = null;
		File out = null;

		try {
			/* ������ null ���θ� üũ�� File ���� */
			in = checkNull(dirOldPath, fileName);
			out = checkNull(dirNewPath, "");
			
			if(in.exists()) {
				/* ���� ��� ���丮�� �������� ������ �ش� ��ο� ���丮 ���� */
				if (!out.isDirectory())
					out.mkdirs();
	
				/* ���� ��� ���丮�� ������ ���ϸ����� File���� */
				out = new File(dirNewPath, fileRename);
	
				/* ���� ��� ������ ������ �о�鿩 ���� ��� ���丮�� ���� ���� */
				FileInputStream fis = new FileInputStream(in);
				FileOutputStream fos = new FileOutputStream(out);
	
				byte[] buf = new byte[10*1024];
				int i = 0;
	
				while ( (i = fis.read(buf)) != -1) {
					fos.write(buf, 0, i);
				}
	
				fis.close();
				fos.close();
			}
		}
		catch (IOException ioe) {
			System.out.println("FileUtil : fileCopy()�� ���� �߻�");
		}
	}
	
	/**
	 * ���� ��ġ�� ���丮 Ȥ�� ������ �����Ѵ�.
	 *
	 * @param String path   ���� ��� ������ ��ġ ���
	 * @param String name   ���� ��� ���ϸ�
	 */
	public static void fileDelete(String path, String name) throws Exception {
		try {
			/* ������ null ���θ� üũ�� File ���� */
			file = checkNull(path, name);

			if (file.exists()) {

				/* ������ ������ ��� �ش� ���丮�� ��� �ִ� ������ ����Ʈ�� ���� */
				String[] fileList = file.list();

				/* ���ϸ���Ʈ�� for������ �����鼭 ���丮 ������ ������ ���� */
				if (file.isDirectory() && (fileList.length != 0)) {
					for (int index = 0; index < fileList.length; index++) {
						File chileFile = checkNull(file.getAbsolutePath(), "");
						if (chileFile.isDirectory())

							/* ���ϸ���Ʈ�� ���ڰ� ���丮�� ��� �ش� ���丮�� ���θ� �˻�*/
							deleteChild(chileFile, fileList[index]);
						else if (chileFile.isFile())
							chileFile.delete();
					}
				}

				/* ����Ʈ ������ ���� ������ �� ���丮 ���� */
				file.delete();
			}
		}
		catch (Exception ex) {
			System.out.println("FileUtil : fileDelete()�� ���� �߻�");
		}
	}

	public static void fileDelete(String path) throws Exception {
		try {
			fileDelete(path, "");
		}
		catch (Exception ex) {
			System.out.println("FileUtil : fileDelete()�� ���� �߻�");
		}
	}

	/**
	 * ���丮 ���� �� ���丮�� ���ο� �����ϴ� ������ ���� �����ϰ� �� ���丮�� �����Ѵ�.
	 *
	 * @param file      ���� ��� ���丮 ������ ������ File
	 * @param fileName  ���� ��� ���ϸ�
	 */
	public static void deleteChild(File file, String fileName) throws Exception {
		File childFile = null;
		try {
			/* �˻� ��� ������ �����ϴ� ���丮 �� ��� ����  */
			if (file.exists() && file.isDirectory()) {

				/* ��� ���丮 ���� ������ ����Ʈ�� ����  */
				String[] fileList = file.list();

				if (fileList.length != 0) {

					for (int index = 0; index < fileList.length; index++) {

						childFile = checkNull(file.getAbsolutePath(), fileList[index]);

						/* ����Ʈ�� ������ ���� */
						if (childFile.isDirectory())
							deleteChild(childFile, fileList[index]);
						else if (childFile.isFile())
							childFile.delete();
					}
				}

				/* ����Ʈ ������ ���� ������ �� ���丮 ���� */
				file.delete();
			}
		}
		catch (Exception ex) {
			System.out.println("FileUtil : deleteChild()�� ���� �߻�");
		}
	}


	/**
	 * �ܰǿ� ���� ���ε� ��� ���ϰ� ���ε� Ÿ�� ���丮�� �Է¹޾� ���ε带 ó���ϴ� �޼ҵ�
	 * ������� : ���ø� ����
	 * @param filePath      ���ε� ��� ���� ����
	 * @param uploadPath    ���ε� Ÿ�� ��ġ ����
	 * @return String       ���ε��� ������ �̸�
	 */
	public String fileUpload(String filePath, String uploadPath) throws Exception {
		String uploadFileName = "";
		/* �Է¹��� ���ϸ�� ��ο� �ѱ��� ���� ��츦 ����� ���ڵ� */
		String saveFile = filePath;
		String saveDirectory = uploadPath;

		/* �Է¹��� ���ϸ��� ���丮 ��α��� �����ϰ� �����Ƿ� ������ ���ϸ� ���� */
		String fileSep = System.getProperty("file.separator");
		int intStart = saveFile.lastIndexOf(fileSep);
		String fileName = saveFile.substring(intStart + 1, saveFile.length());
		File in = null;
		File out = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			/* ���ε� ��� ���ϰ� ���ε� Ÿ�� ��ġ�� ���� File ���� */
			in = new File(saveFile);
			out = new File(saveDirectory, fileName);

			/* ���� ������ �����ϸ� �ٸ� �̸����� ���� ����*/
			if(out.exists()){

			}

			/* ��Ʈ���� ���� ���ε� ��� ������ ���ε� Ÿ�� ��ġ�� ���� */
			fis = new FileInputStream(in);
			fos = new FileOutputStream(out);

			byte[] buf = new byte[10*1024];
			int i = 0;

			while ( (i = fis.read(buf)) != -1) {
				fos.write(buf, 0, i);
			}
			uploadFileName = fileName;
		}
		catch(FileNotFoundException fex){

		}
		catch (Exception ex) {

		}
		finally{
			try{
				fis.close();
				fos.close();
			}
			catch (Exception ex) {

			}

		}
		return uploadFileName;
	}

	/**
	 * �ܰǿ� ���� ���ε� ��� ���ϰ� ���ε� Ÿ�� ���丮�� �Է¹޾� ���ε带 ó���ϴ� �޼ҵ�
	 * ���ε�� �����̸��� ���� ���ǵ� ���� ������ �����Ͽ� ���ε�
	 * ������� : ���ø� ����
	 * @param filePath      ���ε� ��� ���� ����
	 * @param uploadPath    ���ε� Ÿ�� ��ġ ����
	 * @param newFileName   ���ε�� ������ ������ �̸�
	 */
	public void fileUpload(String filePath, String uploadPath , String newFileName) throws Exception {
		String saveFile = filePath;
		String saveDirectory = uploadPath;

		try {
			/* ���ε� ��� ���ϰ� ���ε� Ÿ�� ��ġ�� ���� File ���� */
			File in = new File(saveFile);
			File out = new File(saveDirectory, newFileName);

			/* ��Ʈ���� ���� ���ε� ��� ������ ���ε� Ÿ�� ��ġ�� ���� */
			FileInputStream fis = new FileInputStream(in);
			FileOutputStream fos = new FileOutputStream(out);

			byte[] buf = new byte[10*1024];
			int i = 0;

			while ( (i = fis.read(buf)) != -1) {
				fos.write(buf, 0, i);
			}

			fis.close();
			fos.close();
		}
		catch (Exception ex) {
		}
	}


	/**
	 * ���ϻ�����
	 * @param file
	 * @return int
	 * @throws MainException
	 */
	public int getFileSize(String fileName) throws Exception {
		int fileSize = 0;
		File file = null;
		
		try {
			file = new File(fileName);
			
			if(file.exists()) {
				fileSize = (int)file.length();
			}
		}
		catch (Exception ex) {
		}
		
		return fileSize;
	}
	
    /**
	    * �־��� ������ fullpath�� path�κ��� ������ filname part�� �и��Ͽ� �����Ѵ�.<BR>
	    * (new File(fullpath)).getName()�� �����ϳ� File ��ü�� ������� �ʰ� ���ڿ� ���ϸ����� �м��Ѵ�.<BR>
	    * ���� fullpath�� / Ȥ�� \�� �������� �ʴ� ����� "./" �� ������ ���̴�.
	    *
	    * @param fullpath Path�� filename���� �̷���� ������ fullpath
	    *
	    * @return fullpath�� filename part
	    */
	    public static String getFileNameChop(String fullpath) {
	        if (null == fullpath)
	            return null;
	        fullpath = dosSeperator.matcher(fullpath).replaceAll("/");
	        int pos = fullpath.lastIndexOf("/");
	        if (pos > -1)
	            return fullpath.substring(pos + 1);
	        return fullpath;
	    }

	    /**
	     * ���� ���Ͻý����� seperator(\)�� Java Style (/)�� �����ϱ� ���� ���Ǵ� ���Խ� ����
	     */
	    public static final Pattern dosSeperator = Pattern.compile("\\\\");

	    /**
	     * ���� �ý����� Full Path���� �������� /�� ���������� �˻��ϱ� ���� ���Ǵ� ���Խ� ����
	     */
	    public static final Pattern lastSeperator = Pattern.compile("/$");

}