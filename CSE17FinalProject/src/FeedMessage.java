public class FeedMessage {

        String title;
        String description;
        String link;
        String author;
        String guid;

        /**
         * @return title
         */
        public String getTitle() {
                return title;
        }

        /**
         * @param title
         */
        public void setTitle(String title) {
                this.title = title;
        }

        /**
         * @return description
         */
        public String getDescription() {
                return description;
        }

        /**
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
        }

        /**
         * @return link
         */
        public String getLink() {
                return link;
        }

        /**
         * @param link
         */
        public void setLink(String link) {
                this.link = link;
        }

        /**
         * @return author
         */
        public String getAuthor() {
                return author;
        }

        /**
         * @param author
         */
        public void setAuthor(String author) {
                this.author = author;
        }

        /**
         * @return guid
         */
        public String getGuid() {
                return guid;
        }

        /**
         * @param guid
         */
        public void setGuid(String guid) {
                this.guid = guid;
        }

        @Override
        public String toString() {
                return "FeedMessage [title=" + title + ", description=" + description
                                + ", link=" + link + ", author=" + author + ", guid=" + guid
                                + "]";
        }

}