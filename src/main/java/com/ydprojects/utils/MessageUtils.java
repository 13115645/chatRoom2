package com.ydprojects.utils;

/**
 * 
 * @author Yasiru Dahanayake
 * 
 */

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class MessageUtils
{

	static List<Color> Colours = Arrays.asList(Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.PINK,
			Color.ORANGE);

	/*
	 * method to append to a JTextpane
	 * 
	 * 
	 */
	public static void appendToPane(JTextPane tp, String msg, Color c)
	{

		StyleContext sc = StyleContext.getDefaultStyleContext();
		AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

		aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
		aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

		int len = tp.getDocument().getLength();

		tp.setCaretPosition(len);
		tp.setCharacterAttributes(aset, false);
		tp.replaceSelection(msg);
	}

	/*
	 * generates a random colour
	 */
	public static Color randomColor()
	{

		Collections.shuffle(MessageUtils.Colours);

		return Colours.get(0);
	}

}
