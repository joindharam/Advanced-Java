package servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part image = request.getPart("image");
		PrintWriter out = response.getWriter();
//		String path= request.getRealPath("image") + File.separator + image.getSubmittedFileName();
		String path= "F:" + File.separator + image.getSubmittedFileName();
		
		try {
            FileOutputStream fos = new FileOutputStream(path);
            InputStream is = image.getInputStream();

            byte[] data = new byte[is.available()];
            is.read(data);
            out.print(path);
            fos.write(data);
       
        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
