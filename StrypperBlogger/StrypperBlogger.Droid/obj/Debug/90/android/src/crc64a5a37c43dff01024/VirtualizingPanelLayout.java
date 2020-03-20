package crc64a5a37c43dff01024;


public abstract class VirtualizingPanelLayout
	extends android.support.v7.widget.RecyclerView.LayoutManager
	implements
		mono.android.IGCUserPeer,
		android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_generateDefaultLayoutParams:()Landroid/support/v7/widget/RecyclerView$LayoutParams;:GetGenerateDefaultLayoutParamsHandler\n" +
			"n_onLayoutChildren:(Landroid/support/v7/widget/RecyclerView$Recycler;Landroid/support/v7/widget/RecyclerView$State;)V:GetOnLayoutChildren_Landroid_support_v7_widget_RecyclerView_Recycler_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_scrollVerticallyBy:(ILandroid/support/v7/widget/RecyclerView$Recycler;Landroid/support/v7/widget/RecyclerView$State;)I:GetScrollVerticallyBy_ILandroid_support_v7_widget_RecyclerView_Recycler_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_scrollHorizontallyBy:(ILandroid/support/v7/widget/RecyclerView$Recycler;Landroid/support/v7/widget/RecyclerView$State;)I:GetScrollHorizontallyBy_ILandroid_support_v7_widget_RecyclerView_Recycler_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_canScrollVertically:()Z:GetCanScrollVerticallyHandler\n" +
			"n_canScrollHorizontally:()Z:GetCanScrollHorizontallyHandler\n" +
			"n_scrollToPosition:(I)V:GetScrollToPosition_IHandler\n" +
			"n_removeAllViews:()V:GetRemoveAllViewsHandler\n" +
			"n_onMeasure:(Landroid/support/v7/widget/RecyclerView$Recycler;Landroid/support/v7/widget/RecyclerView$State;II)V:GetOnMeasure_Landroid_support_v7_widget_RecyclerView_Recycler_Landroid_support_v7_widget_RecyclerView_State_IIHandler\n" +
			"n_offsetChildrenHorizontal:(I)V:GetOffsetChildrenHorizontal_IHandler\n" +
			"n_offsetChildrenVertical:(I)V:GetOffsetChildrenVertical_IHandler\n" +
			"n_computeHorizontalScrollExtent:(Landroid/support/v7/widget/RecyclerView$State;)I:GetComputeHorizontalScrollExtent_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_computeHorizontalScrollOffset:(Landroid/support/v7/widget/RecyclerView$State;)I:GetComputeHorizontalScrollOffset_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_computeHorizontalScrollRange:(Landroid/support/v7/widget/RecyclerView$State;)I:GetComputeHorizontalScrollRange_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_computeVerticalScrollExtent:(Landroid/support/v7/widget/RecyclerView$State;)I:GetComputeVerticalScrollExtent_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_computeVerticalScrollOffset:(Landroid/support/v7/widget/RecyclerView$State;)I:GetComputeVerticalScrollOffset_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_computeVerticalScrollRange:(Landroid/support/v7/widget/RecyclerView$State;)I:GetComputeVerticalScrollRange_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"n_onRequestChildFocus:(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;Landroid/view/View;Landroid/view/View;)Z:GetOnRequestChildFocus_Landroid_support_v7_widget_RecyclerView_Landroid_support_v7_widget_RecyclerView_State_Landroid_view_View_Landroid_view_View_Handler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_computeScrollVectorForPosition:(I)Landroid/graphics/PointF;:GetComputeScrollVectorForPosition_IHandler:Android.Support.V7.Widget.RecyclerView/SmoothScroller/IScrollVectorProviderInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.VirtualizingPanelLayout, Uno.UI", VirtualizingPanelLayout.class, __md_methods);
	}


	public VirtualizingPanelLayout ()
	{
		super ();
		if (getClass () == VirtualizingPanelLayout.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.VirtualizingPanelLayout, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public android.support.v7.widget.RecyclerView.LayoutParams generateDefaultLayoutParams ()
	{
		return n_generateDefaultLayoutParams ();
	}

	private native android.support.v7.widget.RecyclerView.LayoutParams n_generateDefaultLayoutParams ();


	public void onLayoutChildren (android.support.v7.widget.RecyclerView.Recycler p0, android.support.v7.widget.RecyclerView.State p1)
	{
		n_onLayoutChildren (p0, p1);
	}

	private native void n_onLayoutChildren (android.support.v7.widget.RecyclerView.Recycler p0, android.support.v7.widget.RecyclerView.State p1);


	public int scrollVerticallyBy (int p0, android.support.v7.widget.RecyclerView.Recycler p1, android.support.v7.widget.RecyclerView.State p2)
	{
		return n_scrollVerticallyBy (p0, p1, p2);
	}

	private native int n_scrollVerticallyBy (int p0, android.support.v7.widget.RecyclerView.Recycler p1, android.support.v7.widget.RecyclerView.State p2);


	public int scrollHorizontallyBy (int p0, android.support.v7.widget.RecyclerView.Recycler p1, android.support.v7.widget.RecyclerView.State p2)
	{
		return n_scrollHorizontallyBy (p0, p1, p2);
	}

	private native int n_scrollHorizontallyBy (int p0, android.support.v7.widget.RecyclerView.Recycler p1, android.support.v7.widget.RecyclerView.State p2);


	public boolean canScrollVertically ()
	{
		return n_canScrollVertically ();
	}

	private native boolean n_canScrollVertically ();


	public boolean canScrollHorizontally ()
	{
		return n_canScrollHorizontally ();
	}

	private native boolean n_canScrollHorizontally ();


	public void scrollToPosition (int p0)
	{
		n_scrollToPosition (p0);
	}

	private native void n_scrollToPosition (int p0);


	public void removeAllViews ()
	{
		n_removeAllViews ();
	}

	private native void n_removeAllViews ();


	public void onMeasure (android.support.v7.widget.RecyclerView.Recycler p0, android.support.v7.widget.RecyclerView.State p1, int p2, int p3)
	{
		n_onMeasure (p0, p1, p2, p3);
	}

	private native void n_onMeasure (android.support.v7.widget.RecyclerView.Recycler p0, android.support.v7.widget.RecyclerView.State p1, int p2, int p3);


	public void offsetChildrenHorizontal (int p0)
	{
		n_offsetChildrenHorizontal (p0);
	}

	private native void n_offsetChildrenHorizontal (int p0);


	public void offsetChildrenVertical (int p0)
	{
		n_offsetChildrenVertical (p0);
	}

	private native void n_offsetChildrenVertical (int p0);


	public int computeHorizontalScrollExtent (android.support.v7.widget.RecyclerView.State p0)
	{
		return n_computeHorizontalScrollExtent (p0);
	}

	private native int n_computeHorizontalScrollExtent (android.support.v7.widget.RecyclerView.State p0);


	public int computeHorizontalScrollOffset (android.support.v7.widget.RecyclerView.State p0)
	{
		return n_computeHorizontalScrollOffset (p0);
	}

	private native int n_computeHorizontalScrollOffset (android.support.v7.widget.RecyclerView.State p0);


	public int computeHorizontalScrollRange (android.support.v7.widget.RecyclerView.State p0)
	{
		return n_computeHorizontalScrollRange (p0);
	}

	private native int n_computeHorizontalScrollRange (android.support.v7.widget.RecyclerView.State p0);


	public int computeVerticalScrollExtent (android.support.v7.widget.RecyclerView.State p0)
	{
		return n_computeVerticalScrollExtent (p0);
	}

	private native int n_computeVerticalScrollExtent (android.support.v7.widget.RecyclerView.State p0);


	public int computeVerticalScrollOffset (android.support.v7.widget.RecyclerView.State p0)
	{
		return n_computeVerticalScrollOffset (p0);
	}

	private native int n_computeVerticalScrollOffset (android.support.v7.widget.RecyclerView.State p0);


	public int computeVerticalScrollRange (android.support.v7.widget.RecyclerView.State p0)
	{
		return n_computeVerticalScrollRange (p0);
	}

	private native int n_computeVerticalScrollRange (android.support.v7.widget.RecyclerView.State p0);


	public boolean onRequestChildFocus (android.support.v7.widget.RecyclerView p0, android.support.v7.widget.RecyclerView.State p1, android.view.View p2, android.view.View p3)
	{
		return n_onRequestChildFocus (p0, p1, p2, p3);
	}

	private native boolean n_onRequestChildFocus (android.support.v7.widget.RecyclerView p0, android.support.v7.widget.RecyclerView.State p1, android.view.View p2, android.view.View p3);


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();


	public android.graphics.PointF computeScrollVectorForPosition (int p0)
	{
		return n_computeScrollVectorForPosition (p0);
	}

	private native android.graphics.PointF n_computeScrollVectorForPosition (int p0);

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
