

package subhamdivakar.example.com.youtubevideo;

import com.google.android.gms.common.Scopes;
import com.google.api.services.youtube.YouTubeScopes;

public class Auth {
    // Register an API key here: https://console.developers.google.com
    public static final String KEY = "Replace me with your API key";

    public static final String[] SCOPES = {Scopes.PROFILE, YouTubeScopes.YOUTUBE};
}
