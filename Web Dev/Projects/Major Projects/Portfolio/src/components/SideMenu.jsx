import "../styles/sideMenu.css";

const sideMenu = () => {
    return (
        <>
            <div className="menu-container">
                <ul>
                    <div className="bio">
                        <li id="myPic"><img src="../../public/naved_pic.jpg" alt="Image: Naved Uddin" /></li>
                        <h4>Naved</h4>
                        <p>Bio: Aspiring front-end developer.</p>
                    </div>
                    <li> About Me</li>
                    <li>Projects</li>
                    <li>Contact Me</li>
                    <li>Hire Me</li>
                </ul>
            </div>
        </>
    )
}

export default sideMenu;