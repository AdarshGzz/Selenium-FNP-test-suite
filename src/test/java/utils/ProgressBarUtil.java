package utils;

import org.openqa.selenium.JavascriptExecutor;
public class ProgressBarUtil extends Base {
    
    public static void setProgress(int percent, String label) {
        String js =
        "if (!document.getElementById('selenium-progress-bar')) {" + //if there is no element with id selenium-progress-bar in the dom then create one
        "  var bar=document.createElement('div');" +  //creating the progress bar element
        "  bar.id='selenium-progress-bar';" +
        "  bar.style.position='fixed';" +            /* styling */
        "  bar.style.top='0';" +                    /* styling */
        "  bar.style.left='0';" +                  /* styling */
        "  bar.style.width='100%';" +
        "  bar.style.height='20px';" +  // 20px is the the thickness/height of our progress bar
        "  bar.style.background='#eee';" +         /* styling */
        "  bar.style.zIndex='99999';" +           /* styling */
        "  bar.innerHTML='<div id=\"selenium-progress-inner\" style=\"height:100%;width:0;background:linear-gradient(90deg,#1976d2,#43e97b);transition:width 0.3s;position:relative;\">" +
        "    <span id=\"selenium-progress-percent\" style=\"position:absolute;right:8px;top:2px;color:white;font-size:12px;font-family:monospace;\">0%</span>" +
        "  </div>';" +
        "  document.body.appendChild(bar);" +
        "  var labelDiv=document.createElement('div');" +
        "  labelDiv.id='selenium-progress-label';" +
        "  labelDiv.style.position='fixed';" +
        "  labelDiv.style.top='25px';" +  
        "  labelDiv.style.left='50%';" +
        "  labelDiv.style.transform='translateX(-50%)';" +
        "  labelDiv.style.background='rgba(25,118,210,0.92)';" +
        "  labelDiv.style.color='#fff';" +
        "  labelDiv.style.padding='3px 16px';" +
        "  labelDiv.style.borderRadius='16px';" +
        "  labelDiv.style.fontSize='13px';" +
        "  labelDiv.style.zIndex='100000';" +
        "  labelDiv.style.fontFamily='monospace,sans-serif';" +
        "  labelDiv.innerText='';" +
        "  document.body.appendChild(labelDiv);" +
        "}" +
        "document.getElementById('selenium-progress-inner').style.width='" + percent + "%';" +
        "document.getElementById('selenium-progress-percent').innerText='" + percent + "%';" +
        "if (" + (label != null ? "true" : "false") + ") {" +
        "  document.getElementById('selenium-progress-label').innerText='" + (label != null ? label.replace("'", "\\'") : "") + "';" +
        "}";

        ((JavascriptExecutor) driver).executeScript(js);
    }

    //Removes the progress bar from the page.
     
    public static void clearProgress() {
        String js =
            "var bar=document.getElementById('selenium-progress-bar');" +
            "if(bar) bar.remove();" +
            "var label=document.getElementById('selenium-progress-label');" +
            "if(label) label.remove();";
        ((JavascriptExecutor) driver).executeScript(js);
    }
}