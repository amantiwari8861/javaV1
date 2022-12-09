package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.darwinsys.servlet.MultipartResponse;

/**
 * Demonstrate MultipartResponse
 */
public class MultipartResponseDemoServlet extends HttpServlet {

	private static final long serialVersionUID = 8641553585638039793L;
	
	/**
	 * Update the message as long as a given thread keeps running
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MultipartResponse resp = new MultipartResponse(response);
		PrintWriter out = resp.getWriter();
		HttpSession session = request.getSession();

		// Thread is set by our invoker.
		Thread runnerThread = (Thread) session.getAttribute("CURRENT_RUNNING_THREAD");
		int i = 0;
		do {
			resp.startResponse("text/html");
			out.print("<html>");
			out.print("    <body>");
			out.print(("       <h1>image" + ++i + "</h1>"));
			out.print("        <img src=\"/images/jumping_mouse.gif\" />");
			out.print("    </body>");
			out.print("</html>");
			resp.endResponse();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// "CANTHAPPEN"
				break;
			}
		} while (runnerThread.isAlive());
		
		// Now it's time to say goodbye, and to display the "final" page.
		resp.endResponse();
		
		// You can't do a response.sendRedirect from here because
		// a redirect consists of a 30x response + a location header, but
		// sendRedirect can not set the 30x status becuase the response is well & truly committed
		// by the time we get past all the image views provided in the multipart response.
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/upload/folderTagger.jsp");
		requestDispatcher.include(request,response);

	}
}