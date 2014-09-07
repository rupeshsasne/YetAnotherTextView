package radix2.yat.widget;

import radix2.app.widget.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;

public class TextView extends android.widget.TextView {

	private Typeface mTypeface;

	public TextView(Context context) {
		super(context);
	}

	public TextView(Context context, AttributeSet attrSet, int defStyle) {
		super(context, attrSet, defStyle);

		initStyle(attrSet);
	}

	public TextView(Context context, AttributeSet attrSet) {
		super(context, attrSet);

		initStyle(attrSet);
	}

	private void initStyle(AttributeSet attrSet) {
		TypedArray a = getContext().getTheme().obtainStyledAttributes(attrSet,
				R.styleable.TextView, 0, 0);

		/*
		 * Apply theme first.
		 */
		int res = a.getResourceId(R.styleable.TextView_TextViewStyle, -1);

		a.recycle();

		String ttfName = null;

		if (res != -1) {
			TypedArray style = getContext().getTheme().obtainStyledAttributes(
					res, R.styleable.TextView);

			ttfName = style.getString(R.styleable.TextView_ttfName);

			style.recycle();
		}

		if (!isInEditMode() && ttfName != null) {
			try {
				mTypeface = Typeface.createFromAsset(getContext().getAssets(),
						ttfName);
			} catch (Exception ex) {
				Log.v(getContext().getString(R.string.app_name),
						String.format(
								getContext().getString(
										R.string.typeface_not_found), ttfName));

			}

		}

		if (mTypeface != null)
			setTypeface(mTypeface);

		/*
		 * Apply individual
		 */
		a = getContext().getTheme().obtainStyledAttributes(attrSet,
				R.styleable.TextView, 0, 0);

		ttfName = a.getString(R.styleable.TextView_ttfName);

		if (!isInEditMode() && ttfName != null) {
			try {
				mTypeface = Typeface.createFromAsset(getContext().getAssets(),
						ttfName);
			} catch (Exception e) {
				Log.v(getContext().getString(R.string.app_name),
						String.format(
								getContext().getString(
										R.string.typeface_not_found), ttfName));
			}
		}

		if (mTypeface != null)
			setTypeface(mTypeface);

		a.recycle();
	}
}
