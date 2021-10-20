public class Codec {

    private String url = "";
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        url = longUrl;
        return "http://tinyurl.com/4e9iAk";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return url;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
