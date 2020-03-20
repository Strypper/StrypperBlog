package crc64a5a37c43dff01024;


public class PivotAdapter
	extends android.support.v4.app.FragmentPagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_notifyDataSetChanged:()V:GetNotifyDataSetChangedHandler\n" +
			"n_getItem:(I)Landroid/support/v4/app/Fragment;:GetGetItem_IHandler\n" +
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_getPageTitle:(I)Ljava/lang/CharSequence;:GetGetPageTitle_IHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.PivotAdapter, Uno.UI", PivotAdapter.class, __md_methods);
	}


	public PivotAdapter (android.support.v4.app.FragmentManager p0)
	{
		super (p0);
		if (getClass () == PivotAdapter.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.PivotAdapter, Uno.UI", "Android.Support.V4.App.FragmentManager, Xamarin.Android.Support.Fragment", this, new java.lang.Object[] { p0 });
	}


	public void notifyDataSetChanged ()
	{
		n_notifyDataSetChanged ();
	}

	private native void n_notifyDataSetChanged ();


	public android.support.v4.app.Fragment getItem (int p0)
	{
		return n_getItem (p0);
	}

	private native android.support.v4.app.Fragment n_getItem (int p0);


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public java.lang.CharSequence getPageTitle (int p0)
	{
		return n_getPageTitle (p0);
	}

	private native java.lang.CharSequence n_getPageTitle (int p0);

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
