import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class BaseJump extends Application {
    private static final String BOOTSTRAP_PREFIX = "http://getbootstrap.com/components/#";

    private enum Anchor { progress, jumbotron, badges, pagination }

    @Override public void start(Stage stage) throws Exception {
        final WebView webview = new WebView();

        final ToolBar nav = new ToolBar();
        for (Anchor anchor : Anchor.values()) {
            nav.getItems().add(
                    new NavButton(
                            anchor,
                            webview
                    )
            );
        }

        VBox layout = new VBox();
        layout.getChildren().addAll(
                nav,
                webview
        );

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }

    private class NavButton extends Button {
        public NavButton(final Anchor anchor, final WebView webview) {
            setText(anchor.toString());

            setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    webview.getEngine().load(BOOTSTRAP_PREFIX + anchor.toString());
                }
            });
        }
    }
}