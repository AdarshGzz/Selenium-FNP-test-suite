package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HighlightUtil extends Base {
	public static void highlightElement(By loc) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript(
//	        "arguments[0].style.boxShadow='0 0 10px 5px yellow';" +
//	        "arguments[0].style.transition='box-shadow 0.5s';" +
//	        "setTimeout(function(){ arguments[0].style.boxShadow=''; }, arguments[1]);",
//	        element, durationMillis
//	    );
		  String script = "var elem = arguments[0];" + "var duration = arguments[1];" +
		  "var original = elem.getAttribute('style') || '';" +
		  "var unique = 'selenium-pro-highlight-' + Math.floor(Math.random()*1e6);" +
		  "elem.classList.add(unique);" + // Add stylesheet if not present
		  "if(!document.getElementById('selenium-pro-highlight-style')){" +
		  " var style=document.createElement('style');" +
		  " style.id='selenium-pro-highlight-style';" + " style.textContent = `" +
		  "  @keyframes pro-glow {" +
		  "    0% { box-shadow: 0 0 4px 1px #7ef9ff, 0 0 12px 2px #a259f7; border-color: #7ef9ff; }"
		  +
		  "   50% { box-shadow: 0 0 12px 2px #a259f7, 0 0 18px 4px #43e97b; border-color: #a259f7; }"
		  +
		  "  100% { box-shadow: 0 0 4px 1px #7ef9ff, 0 0 12px 2px #a259f7; border-color: #7ef9ff; }"
		  + "  }" + "  .selenium-pro-highlight {" +
		  "    border: 2px solid #7ef9ff !important;" +
		  "    border-radius: 8px !important;" +
		  "    animation: pro-glow 1.5s infinite alternate;" +
		  "    transition: border-color 0.3s, box-shadow 0.3s;" +
		  "    position: relative !important;" + "    z-index: 9999 !important;" +
		  "  }" + "  .selenium-pro-highlight::after {" + "    content: '';" +
		  "    position: absolute; left: -3px; right: -3px; top: -3px; bottom: -3px;" +
		  "    border-radius: 11px;" + "    pointer-events: none;" +
		  "    background: linear-gradient(270deg, #7ef9ff, #a259f7, #43e97b, #38f9d7, #7ef9ff);"
		  + "    background-size: 300% 300%;" + "    opacity: 0.18;" +
		  "    animation: pro-gradient-move 3s linear infinite;" + "  }" +
		  "  @keyframes pro-gradient-move {" + "    0% { background-position:0% 50%; }"
		  + "   50% { background-position:100% 50%; }" +
		  "  100% { background-position:0% 50%; }" + "  }" + " `;" +
		  " document.head.appendChild(style);" + "}" +
		  "elem.classList.add('selenium-pro-highlight');" + "setTimeout(function(){" +
		  " elem.classList.remove('selenium-pro-highlight');" +
		  " elem.classList.remove(unique);" + " elem.setAttribute('style', original);"
		  + "}, duration);"; ((JavascriptExecutor) driver).executeScript(script,
		  driver.findElement(loc), 2000);
	}
	public static void highlightElementByEle(WebElement elem) {
		  String script = "var elem = arguments[0];" + "var duration = arguments[1];" +
		  "var original = elem.getAttribute('style') || '';" +
		  "var unique = 'selenium-pro-highlight-' + Math.floor(Math.random()*1e6);" +
		  "elem.classList.add(unique);" + // Add stylesheet if not present
		  "if(!document.getElementById('selenium-pro-highlight-style')){" +
		  " var style=document.createElement('style');" +
		  " style.id='selenium-pro-highlight-style';" + " style.textContent = `" +
		  "  @keyframes pro-glow {" +
		  "    0% { box-shadow: 0 0 4px 1px #7ef9ff, 0 0 12px 2px #a259f7; border-color: #7ef9ff; }"
		  +
		  "   50% { box-shadow: 0 0 12px 2px #a259f7, 0 0 18px 4px #43e97b; border-color: #a259f7; }"
		  +
		  "  100% { box-shadow: 0 0 4px 1px #7ef9ff, 0 0 12px 2px #a259f7; border-color: #7ef9ff; }"
		  + "  }" + "  .selenium-pro-highlight {" +
		  "    border: 2px solid #7ef9ff !important;" +
		  "    border-radius: 8px !important;" +
		  "    animation: pro-glow 1.5s infinite alternate;" +
		  "    transition: border-color 0.3s, box-shadow 0.3s;" +
		  "    position: relative !important;" + "    z-index: 9999 !important;" +
		  "  }" + "  .selenium-pro-highlight::after {" + "    content: '';" +
		  "    position: absolute; left: -3px; right: -3px; top: -3px; bottom: -3px;" +
		  "    border-radius: 11px;" + "    pointer-events: none;" +
		  "    background: linear-gradient(270deg, #7ef9ff, #a259f7, #43e97b, #38f9d7, #7ef9ff);"
		  + "    background-size: 300% 300%;" + "    opacity: 0.18;" +
		  "    animation: pro-gradient-move 3s linear infinite;" + "  }" +
		  "  @keyframes pro-gradient-move {" + "    0% { background-position:0% 50%; }"
		  + "   50% { background-position:100% 50%; }" +
		  "  100% { background-position:0% 50%; }" + "  }" + " `;" +
		  " document.head.appendChild(style);" + "}" +
		  "elem.classList.add('selenium-pro-highlight');" + "setTimeout(function(){" +
		  " elem.classList.remove('selenium-pro-highlight');" +
		  " elem.classList.remove(unique);" + " elem.setAttribute('style', original);"
		  + "}, duration);"; ((JavascriptExecutor) driver).executeScript(script,
		  elem, 2000);
	}
		public static void highlightElement(WebElement elem) {
	//		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	    js.executeScript(
	//	        "arguments[0].style.boxShadow='0 0 10px 5px yellow';" +
	//	        "arguments[0].style.transition='box-shadow 0.5s';" +
	//	        "setTimeout(function(){ arguments[0].style.boxShadow=''; }, arguments[1]);",
	//	        element, durationMillis
	//	    );
			  String script = "var elem = arguments[0];" + "var duration = arguments[1];" +
			  "var original = elem.getAttribute('style') || '';" +
			  "var unique = 'selenium-pro-highlight-' + Math.floor(Math.random()*1e6);" +
			  "elem.classList.add(unique);" + // Add stylesheet if not present
			  "if(!document.getElementById('selenium-pro-highlight-style')){" +
			  " var style=document.createElement('style');" +
			  " style.id='selenium-pro-highlight-style';" + " style.textContent = `" +
			  "  @keyframes pro-glow {" +
			  "    0% { box-shadow: 0 0 4px 1px #7ef9ff, 0 0 12px 2px #a259f7; border-color: #7ef9ff; }"
			  +
			  "   50% { box-shadow: 0 0 12px 2px #a259f7, 0 0 18px 4px #43e97b; border-color: #a259f7; }"
			  +
			  "  100% { box-shadow: 0 0 4px 1px #7ef9ff, 0 0 12px 2px #a259f7; border-color: #7ef9ff; }"
			  + "  }" + "  .selenium-pro-highlight {" +
			  "    border: 2px solid #7ef9ff !important;" +
			  "    border-radius: 8px !important;" +
			  "    animation: pro-glow 1.5s infinite alternate;" +
			  "    transition: border-color 0.3s, box-shadow 0.3s;" +
			  "    position: relative !important;" + "    z-index: 9999 !important;" +
			  "  }" + "  .selenium-pro-highlight::after {" + "    content: '';" +
			  "    position: absolute; left: -3px; right: -3px; top: -3px; bottom: -3px;" +
			  "    border-radius: 11px;" + "    pointer-events: none;" +
			  "    background: linear-gradient(270deg, #7ef9ff, #a259f7, #43e97b, #38f9d7, #7ef9ff);"
			  + "    background-size: 300% 300%;" + "    opacity: 0.18;" +
			  "    animation: pro-gradient-move 3s linear infinite;" + "  }" +
			  "  @keyframes pro-gradient-move {" + "    0% { background-position:0% 50%; }"
			  + "   50% { background-position:100% 50%; }" +
			  "  100% { background-position:0% 50%; }" + "  }" + " `;" +
			  " document.head.appendChild(style);" + "}" +
			  "elem.classList.add('selenium-pro-highlight');" + "setTimeout(function(){" +
			  " elem.classList.remove('selenium-pro-highlight');" +
			  " elem.classList.remove(unique);" + " elem.setAttribute('style', original);"
			  + "}, duration);"; ((JavascriptExecutor) driver).executeScript(script,
			  elem, 2000);
		}
}
