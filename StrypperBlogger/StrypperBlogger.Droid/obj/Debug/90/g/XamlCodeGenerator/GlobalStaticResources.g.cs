// <autogenerated />
#pragma warning disable 618  // Ignore obsolete members warnings
#pragma warning disable 105  // Ignore duplicate namespaces
#pragma warning disable 1591 // Ignore missing XML comment warnings
using System;
using System.Linq;
using System.Collections.Generic;
using Uno.Extensions;
using Uno;
using System.Diagnostics;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Documents;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Media.Animation;
using StrypperBlogger.Droid;

namespace StrypperBlogger.Droid
{
	/// <summary>
	/// Contains all the static resources defined for the application
	/// </summary>
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV0056", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV0058", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV1003", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV0085", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2001", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2003", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2004", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2005", Justification="Generated code")]
	public sealed partial class GlobalStaticResources
	{
		static bool _initialized;
		static GlobalStaticResources()
		{
			Initialize();
		}
		public static void Initialize()
		{
			if(!_initialized)
			{
				_initialized = true;
				global::Uno.UI.GlobalStaticResources.Initialize();
				AddResolver(global::Uno.UI.GlobalStaticResources.FindResource);
				global::Uno.UI.Toolkit.GlobalStaticResources.Initialize();
				AddResolver(global::Uno.UI.Toolkit.GlobalStaticResources.FindResource);
				RegisterResources_App_3c7689713f8cc199a1f5cbc3f50236a3();
				RegisterImplicitStylesResources_App_3c7689713f8cc199a1f5cbc3f50236a3();
				RegisterResources_MainPage_871e75801be4a4f6d69daee64194f6f6();
				RegisterImplicitStylesResources_MainPage_871e75801be4a4f6d69daee64194f6f6();
			}
		}
		static partial void RegisterResources_App_3c7689713f8cc199a1f5cbc3f50236a3();
		static partial void RegisterImplicitStylesResources_App_3c7689713f8cc199a1f5cbc3f50236a3();
		static partial void RegisterResources_MainPage_871e75801be4a4f6d69daee64194f6f6();
		static partial void RegisterImplicitStylesResources_MainPage_871e75801be4a4f6d69daee64194f6f6();
		
		/// <summary>
		/// Finds a resource instance in the Global Static Resources
		/// </summary>
		/// <param name="name">The name of the resource</param>
		/// <returns>The instance of the resources, otherwise null.</returns>
		public static object FindResource(string name)
		{
			foreach(var resolver in _resolvers)
			{
				var resource = resolver(name);
				if(resource != null){ return resource; }
			}
			return null;
		}
		
		private static List<Func<string, object>> _resolvers = new List<Func<string, object>>();
		private static void AddResolver(Func<string, object> resolver)
		{
			_resolvers.Add(resolver);
		}
	}
}
