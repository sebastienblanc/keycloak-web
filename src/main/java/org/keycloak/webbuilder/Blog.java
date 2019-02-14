package org.keycloak.webbuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Blog {

    private final Date date;

    private final String title;

    private final boolean publish;

    private final String template;

    private final Map<String, Object> map = new HashMap<>();

    public Blog(Date date, String title, boolean publish, String template) {
        this.date = date;
        this.title = title;
        this.publish = publish;
        this.template = template;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getFilename() {
        return title.toLowerCase().replace(" ", "-").replace("\\.", "").replace("?", "").replace("!", "") + ".html";
    }

    public boolean isPublish() {
        return publish;
    }

    public String getTemplate() {
        return template;
    }

    public Map<String, Object> getMap() {
        return map;
    }
}