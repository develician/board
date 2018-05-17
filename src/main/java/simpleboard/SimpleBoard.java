package simpleboard;

import java.util.ArrayList;
import java.util.List;

public class SimpleBoard {

    List<Article> store = new ArrayList<Article>();

    public boolean add(Article article) {
        store.add(article);
        return true;
    }

    public Article get(long l) {
        for (Article article : store) {
            if (l == article.getId()) {
                try {
                    return (Article) article.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


    public void update(Article article2) {
        int idx = 0;
        for (Article article : store) {
            if (article.getId() == article2.getId()) {
                article = article2;
                store.remove(idx);
                store.add(idx, article2);

            }
            idx++;
        }
    }

    public boolean delete(long l) {
        for (Article article : store) {
            if (l == article.getId()) {
                store.remove(article);
                return true;
            }
        }
        return false;
    }

    public long size() {
        return store.size();
    }

    public List<Article> getList() {
        return store;
    }

}
