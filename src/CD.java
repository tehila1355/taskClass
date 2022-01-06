public class CD {
    private String title;
    public static final int MAX = 20;
    private String[] songList;
    private double price;


    public CD (String title,double price) {
        this.title = title;
        this.price = price;
        this.songList = new String[MAX];
    }

    public CD (CD other){
        this.title = other.title;
        this.price = other.price;
    }

    public String getTitle () {
        return title;
    }

    public void removeSong (String[] songList,String songName) {
        int counter = 0;
        String[] newArray = new String[songList.length - 1];
        for (int i = 0; i < this.songList.length; i++) {
            if (!this.title.equals(songName)) {
                newArray[counter] = this.songList[i];
                counter++;
            }
        }
    }
}