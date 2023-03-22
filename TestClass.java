public class TestClass {
    public static void main(String[] args) {
        RecentlyPlayedStore rps = new RecentlyPlayedStore(4,3);
        rps.addSongPlayed("Vivek","S1");
        rps.addSongPlayed("Vivek","S2");
        rps.addSongPlayed("Vivek","S3");
        rps.addSongPlayed("Vivek","S4");
        rps.addSongPlayed("Vivek","S5");
        rps.addSongPlayed("Vivek1","S1");
//        rps.addSongPlayed("Vivek2","S1");
//        rps.addSongPlayed("Vivek3","S1");

        System.out.println(rps.getRecentlyPlayedSongs("Vivek"));
        System.out.println(rps.getRecentlyPlayedSongs("Vivek1"));
        System.out.println(rps.getRecentlyPlayedSongs("Vivek2"));
        System.out.println(rps.getRecentlyPlayedSongs("Vivek3"));
    }
}
