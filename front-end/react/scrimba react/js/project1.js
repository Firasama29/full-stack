// import NavBar from "./NavBar"
// import List from "./List"

function NavBar() {
    return (
        <nav className="nav">
            <img src="logo-og.png" className="nav-logo"/>
            <ul className="nav-list">
                <li>Pricing</li>
                <li>About</li>
                <li>Contact</li>
            </ul>
        </nav>
    )
}

function List() {
    return (
        <div className="header">
        <h1 className="header-title">Fun Facts about React</h1>
        <ul >
            <li>Was first released in 2013</li>
            <li>Was originally created by Jordan Walke</li>
            <li>Has well over 100k stars on Github</li>
            <li>Powers thousands of enterprise apps, including mobile apps</li>
        </ul>
        
    </div>
    )
}

ReactDOM.render(
    <div>
        <NavBar />
        <List />
    </div>,

    document.getElementById("project")
)