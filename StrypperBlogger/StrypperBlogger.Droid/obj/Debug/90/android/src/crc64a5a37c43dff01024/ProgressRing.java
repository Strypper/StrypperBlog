package crc64a5a37c43dff01024;


public class ProgressRing
	extends crc6485314a2a4d7fccfc.BindableProgressBar
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onInitializeAccessibilityNodeInfo:(Landroid/view/accessibility/AccessibilityNodeInfo;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_accessibility_AccessibilityNodeInfo_Handler\n" +
			"n_sendAccessibilityEvent:(I)V:GetSendAccessibilityEvent_IHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.ProgressRing, Uno.UI", ProgressRing.class, __md_methods);
	}


	public ProgressRing (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ProgressRing.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.ProgressRing, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ProgressRing (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ProgressRing.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.ProgressRing, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ProgressRing (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ProgressRing.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.ProgressRing, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ProgressRing (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == ProgressRing.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.ProgressRing, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public boolean dispatchTouchEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTouchEvent (p0);
	}

	private native boolean n_dispatchTouchEvent (android.view.MotionEvent p0);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0)
	{
		n_onInitializeAccessibilityNodeInfo (p0);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0);


	public void sendAccessibilityEvent (int p0)
	{
		n_sendAccessibilityEvent (p0);
	}

	private native void n_sendAccessibilityEvent (int p0);

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
