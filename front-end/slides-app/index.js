// import Navbar from "./Navbar"
function Navbar() {
    return (
       <nav>
            <img src="images/logo-og.png" className="nav--logo"/>
            <h2 className="nav--header">ReactLearn</h2>
            <h3 classNam="nav--title">Project-1</h3>
       </nav>
    )
}

function List() {
   return (
        <main>
            <h2 className="main--title">Learning topics</h2>
            <ul className="main--list">
                <li>React library</li>
                <li>React-dom library</li>
                <li>Javascript</li>
                <li>React components</li>
            </ul>
        </main>
       
   )
}

ReactDOM.render(
    <div>
        <Navbar />
        <List />
    </div>,
    document.getElementById("root")
)