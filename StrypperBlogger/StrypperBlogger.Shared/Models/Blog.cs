using System;
using System.Collections.Generic;
using System.Text;

namespace StrypperBlogger.Shared.Models
{
    public class Blog
    {
        public string Title { get; set; }
        public string Image { get; set; }
        public string Describ { get; set; }
    }
    public class BlogData
    {
        public static List<Blog> getBlogs() 
        {
            List<Blog> data = new List<Blog>();
            data.Add(new Blog { Title = "Uno Platform review", Image = "Assets/Photo/Uno.png", Describ = "The only platform for building native mobile, desktop and WebAssembly apps with C#, XAML from a single codebase. Open source and professionally supported." });
            data.Add(new Blog { Title = "Xamarin review", Image = "Assets/Photo/Xamarin.jpg", Describ = "Xamarin apps are native apps! Whether you're designing a uniform UI across platforms or building a native user interface." });
            data.Add(new Blog { Title = ".NET 5 review", Image = "Assets/Photo/DotNet5.png", Describ = "At the end of last year, we shipped .NET Core 3.0 and 3.1. These versions added the desktop app models Windows Forms (WinForms) and WPF, ASP.NET Blazor." });
            data.Add(new Blog { Title = "Uno Platform review", Image = "Assets/Photo/Uno.png", Describ = "The only platform for building native mobile, desktop and WebAssembly apps with C#, XAML from a single codebase. Open source and professionally supported." });
            data.Add(new Blog { Title = "Xamarin review", Image = "Assets/Photo/Xamarin.jpg", Describ = "Xamarin apps are native apps! Whether you're designing a uniform UI across platforms or building a native user interface." });
            data.Add(new Blog { Title = ".NET 5 review", Image = "Assets/Photo/DotNet5.png", Describ = "At the end of last year, we shipped .NET Core 3.0 and 3.1. These versions added the desktop app models Windows Forms (WinForms) and WPF, ASP.NET Blazor." });
            data.Add(new Blog { Title = "Uno Platform review", Image = "Assets/Photo/Uno.png", Describ = "The only platform for building native mobile, desktop and WebAssembly apps with C#, XAML from a single codebase. Open source and professionally supported." });
            data.Add(new Blog { Title = "Xamarin review", Image = "Assets/Photo/Xamarin.jpg", Describ = "Xamarin apps are native apps! Whether you're designing a uniform UI across platforms or building a native user interface." });
            data.Add(new Blog { Title = ".NET 5 review", Image = "Assets/Photo/DotNet5.png", Describ = "At the end of last year, we shipped .NET Core 3.0 and 3.1. These versions added the desktop app models Windows Forms (WinForms) and WPF, ASP.NET Blazor." });
            return data;
        }
    }
}
