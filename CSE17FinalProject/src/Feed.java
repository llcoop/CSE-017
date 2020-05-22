import java.util.ArrayList;
import java.util.List;

/*
 * Stores an RSS feed
 */
/**
 * @author elloc_000
 *
 */
public class Feed {

        final String title;
        final String link;
        final String description;
        final String language;
        final String copyright;
        final String pubDate;

        final List<FeedMessage> entries = new ArrayList<FeedMessage>();

        /**
         * @param title
         *     the title of the article
         * @param link
         *     the link to the article
         * @param description
         *     the description of the article
         * @param language
         *     the language of the 
         * @param copyright
         * @param pubDate
         */
        public Feed(String title, String link, String description, String language,
                        String copyright, String pubDate) {
                this.title = title;
                this.link = link;
                this.description = description;
                this.language = language;
                this.copyright = copyright;
                this.pubDate = pubDate;
        }

        /**
         * @return entries
         */
        public List<FeedMessage> getMessages() {
                return entries;
        }

        /**
         * @return title
         */
        public String getTitle() {
                return title;
        }

        /**
         * @return link
         */
        public String getLink() {
                return link;
        }

        /**
         * @return description
         */
        public String getDescription() {
                return description;
        }

        /**
         * @return language
         */
        public String getLanguage() {
                return language;
        }

        /**
         * @return copyright
         */
        public String getCopyright() {
                return copyright;
        }

        /**
         * @return pubDate
         */
        public String getPubDate() {
                return pubDate;
        }

        @Override
        public String toString() {
                return "Feed [copyright=" + copyright + ", description=" + description
                                + ", language=" + language + ", link=" + link + ", pubDate="
                                + pubDate + ", title=" + title + "]";
        }

}
