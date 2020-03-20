package crc6485314a2a4d7fccfc;


public class BindableSearchView
	extends android.widget.SearchView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_isSubmitButtonEnabled:()Z:GetIsSubmitButtonEnabledHandler\n" +
			"n_setSubmitButtonEnabled:(Z)V:GetSetSubmitButtonEnabled_ZHandler\n" +
			"n_isIconified:()Z:GetIsIconifiedHandler\n" +
			"n_setIconified:(Z)V:GetSetIconified_ZHandler\n" +
			"n_isQueryRefinementEnabled:()Z:GetIsQueryRefinementEnabledHandler\n" +
			"n_setQueryRefinementEnabled:(Z)V:GetSetQueryRefinementEnabled_ZHandler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_hashCode:()I:GetGetHashCodeHandler\n" +
			"n_GetBinderDetail:()Lcrc64396ef219c2977f4f/BinderDetails;:__export__\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableSearchView, Uno.UI", BindableSearchView.class, __md_methods);
	}


	public BindableSearchView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BindableSearchView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableSearchView, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BindableSearchView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BindableSearchView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableSearchView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BindableSearchView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BindableSearchView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableSearchView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public BindableSearchView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == BindableSearchView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableSearchView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public crc64396ef219c2977f4f.BinderDetails xamlBinder = GetBinderDetail ();


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public boolean isSubmitButtonEnabled ()
	{
		return n_isSubmitButtonEnabled ();
	}

	private native boolean n_isSubmitButtonEnabled ();


	public void setSubmitButtonEnabled (boolean p0)
	{
		n_setSubmitButtonEnabled (p0);
	}

	private native void n_setSubmitButtonEnabled (boolean p0);


	public boolean isIconified ()
	{
		return n_isIconified ();
	}

	private native boolean n_isIconified ();


	public void setIconified (boolean p0)
	{
		n_setIconified (p0);
	}

	private native void n_setIconified (boolean p0);


	public boolean isQueryRefinementEnabled ()
	{
		return n_isQueryRefinementEnabled ();
	}

	private native boolean n_isQueryRefinementEnabled ();


	public void setQueryRefinementEnabled (boolean p0)
	{
		n_setQueryRefinementEnabled (p0);
	}

	private native void n_setQueryRefinementEnabled (boolean p0);


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();


	public int hashCode ()
	{
		return n_hashCode ();
	}

	private native int n_hashCode ();

	public crc64396ef219c2977f4f.BinderDetails GetBinderDetail ()
	{
		return n_GetBinderDetail ();
	}

	private native crc64396ef219c2977f4f.BinderDetails n_GetBinderDetail ();


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
