public class Task2 {
    public static void main(String[] args) {
        File[] files=new File[3];
        files[0]=new TextFile("document.txt",100,"UTF-8");
        files[1]=new ImageFile("photo.jpg",5000,"1920x1080");
        files[2]=new ArchiveFile("backup.zip",20000,5);
        for (File f: files) {
            System.out.println(f.getDescription());
            System.out.println(f.toString());
            System.out.println("---");
        }
    }
}

class File {
    private String name;
    private int size;
    public File(String name,int size) {
        this.name=name;
        this.size=size;
    }
    public String getName() { return name; }
    public int getSize() { return size; }
    public String getDescription() {
        return "Файл: "+name+", размер: "+size+" байт";
    }
    @Override
    public String toString() {
        return "File{name='"+name+"', size="+size+"}";
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        File file=(File) obj;
        return size==file.size && name.equals(file.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode()+size;
    }
}

class TextFile extends File {
    private String encoding;
    public TextFile(String name,int size,String encoding) {
        super(name,size);
        this.encoding=encoding;
    }
    @Override
    public String getDescription() {
        return "Текстовый файл: "+getName()+", размер: "+getSize()+", кодировка: "+encoding;
    }
    @Override
    public String toString() {
        return "TextFile{name='"+getName()+"', encoding='"+encoding+"'}";
    }
}

class ImageFile extends File {
    private String resolution;
    public ImageFile(String name,int size,String resolution) {
        super(name,size);
        this.resolution=resolution;
    }
    @Override
    public String getDescription() {
        return "Изображение: "+getName()+", размер: "+getSize()+", разрешение: "+resolution;
    }
    @Override
    public String toString() {
        return "ImageFile{name='"+getName()+"', resolution='"+resolution+"'}";
    }
}

class ArchiveFile extends File {
    private int fileCount;
    public ArchiveFile(String name,int size,int fileCount) {
        super(name,size);
        this.fileCount=fileCount;
    }
    @Override
    public String getDescription() {
        return "Архив: "+getName()+", размер: "+getSize()+", файлов внутри: "+fileCount;
    }
    @Override
    public String toString() {
        return "ArchiveFile{name='"+getName()+"', fileCount="+fileCount+"}";
    }
}