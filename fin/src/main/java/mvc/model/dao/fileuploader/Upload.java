package mvc.model.dao.fileuploader;

import mvc.model.models.Image;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Set;

/**
 * @author slavalymar
 * @since 19.06.2017
 * @version 1
 */
public interface Upload {

    Set<Image> getFiles(HttpServletRequest req, MultipartFile[] files) throws IOException, ServletException;
}
