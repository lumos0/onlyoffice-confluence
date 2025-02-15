package onlyoffice.managers.document;

import com.atlassian.confluence.user.ConfluenceUser;
import onlyoffice.model.config.DocumentType;
import onlyoffice.model.config.Type;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface DocumentManager extends Serializable {
    long getMaxFileSize();

    long getConvertationFileSizeMax();

    String getKeyOfFile(Long attachmentId, boolean embedded);

    String createHash(String str);

    String readHash(String base64);

    String getCorrectName(String fileName, String fileExt, Long pageID);

    Long createDemo(String fileName, String fileExt, Long pageID, ConfluenceUser user) throws IOException;

    DocumentType getDocType(String ext);

    Type getEditorType(String userAgent);

    String getMimeType(String name);

    boolean isEditable(String fileExtension);

    boolean isFillForm(String fileExtension);

    boolean isViewable(String fileExtension);

    List<String> getInsertImageTypes();

    List<String> getCompareFileTypes();

    List<String> getMailMergeTypes();
}
