package chatRoom2;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class MessageUtils {

	static List<Color> Colours = Arrays.asList(Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.PINK,
			Color.ORANGE);

	static void appendToPane(JTextPane tp, String msg, Color c) {

		StyleContext sc = StyleContext.getDefaultStyleContext();
		AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

		aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
		aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

		int len = tp.getDocument().getLength();

		tp.setCaretPosition(len);
		tp.setCharacterAttributes(aset, false);
		tp.replaceSelection(msg);
	}

	static Color randomColor() {

		Collections.shuffle(MessageUtils.Colours);

		return Colours.get(0);
	}

	static Color checkcolor(String string) {
		Color color = null;

		if (string.equalsIgnoreCase(("java.awt.Color[r=255,g=0,b=0]").replaceAll("\\s+", ""))) {

			color = Color.RED;

		} else if (string.equalsIgnoreCase(("java.awt.Color[r=0,g=0,b=0]").replaceAll("\\s+", ""))) {

			color = Color.BLACK;

		} else if (string.equalsIgnoreCase(("java.awt.Color[r=255,g175,b=175]").replaceAll("\\s+", ""))) {

			color = Color.PINK;

		} else if (string.equalsIgnoreCase(("java.awt.Color[r=0,g255,b=0]").replaceAll("\\s+", ""))) {

			color = Color.GREEN;

		} else if (string.equalsIgnoreCase(("java.awt.Color[r=0,g0,b=255]").replaceAll("\\s+", ""))) {

			color = Color.BLUE;

		} else {
			color = Color.MAGENTA;
		}

		return color;
	}
}
