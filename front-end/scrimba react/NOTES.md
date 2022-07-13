Steps to use react on your machine

FIRST: 
import react and react-dom libraries from CDN (https://reactjs.org/docs/cdn-links.html)

<script crossorigin src="https://unpkg.com/react@17/umd/react.development.js"></script>
<script crossorigin src="https://unpkg.com/react-dom@17/umd/react-dom.development.js"></script>

SECOND:
import bable to allow more features for react such as JXS (https://reactjs.org/docs/add-react-to-a-website.html#quickly-try-jsx)
<script src="https://unpkg.com/babel-standalone@6/babel.min.js"></script>

THIRD:
to use JXS in any script tag inside body, add this type="text/babel" attribute to it

Now you have an access to global variable called ReactDOM whih you can use in a js file

FOURTH:
Use ReactDOM.render() method to rend any html tag inside the js file and use document.getElementById() to specify where to render that element.

>>>>>>NOTE
The correct way to create react components is by including all the JSX content inside a function and then calling that function inside the ReactDOM.render() method as a tag. For example

function ExampleFunction(
    ...
)

ReactDOM.render(
    <ExampleFUnction />,
    document.getElementById("id")
)


