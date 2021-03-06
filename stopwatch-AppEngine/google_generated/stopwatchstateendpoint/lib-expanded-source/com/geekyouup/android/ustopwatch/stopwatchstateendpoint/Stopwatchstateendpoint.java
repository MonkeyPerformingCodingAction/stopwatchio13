/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-06-05 16:09:48 UTC)
 * on 2013-06-12 at 20:19:17 UTC 
 * Modify at your own risk.
 */

package com.geekyouup.android.ustopwatch.stopwatchstateendpoint;

/**
 * Service definition for Stopwatchstateendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link StopwatchstateendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Stopwatchstateendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.15.0-rc of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "stopwatchstateendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Stopwatchstateendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Stopwatchstateendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getStopWatchState".
   *
   * This request holds the parameters needed by the the stopwatchstateendpoint server.  After setting
   * any optional parameters, call the {@link GetStopWatchState#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetStopWatchState getStopWatchState(java.lang.Long id) throws java.io.IOException {
    GetStopWatchState result = new GetStopWatchState(id);
    initialize(result);
    return result;
  }

  public class GetStopWatchState extends StopwatchstateendpointRequest<com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState> {

    private static final String REST_PATH = "stopwatchstate/{id}";

    /**
     * Create a request for the method "getStopWatchState".
     *
     * This request holds the parameters needed by the the stopwatchstateendpoint server.  After
     * setting any optional parameters, call the {@link GetStopWatchState#execute()} method to invoke
     * the remote operation. <p> {@link GetStopWatchState#initialize(com.google.api.client.googleapis.
     * services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetStopWatchState(java.lang.Long id) {
      super(Stopwatchstateendpoint.this, "GET", REST_PATH, null, com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetStopWatchState setAlt(java.lang.String alt) {
      return (GetStopWatchState) super.setAlt(alt);
    }

    @Override
    public GetStopWatchState setFields(java.lang.String fields) {
      return (GetStopWatchState) super.setFields(fields);
    }

    @Override
    public GetStopWatchState setKey(java.lang.String key) {
      return (GetStopWatchState) super.setKey(key);
    }

    @Override
    public GetStopWatchState setOauthToken(java.lang.String oauthToken) {
      return (GetStopWatchState) super.setOauthToken(oauthToken);
    }

    @Override
    public GetStopWatchState setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetStopWatchState) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetStopWatchState setQuotaUser(java.lang.String quotaUser) {
      return (GetStopWatchState) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetStopWatchState setUserIp(java.lang.String userIp) {
      return (GetStopWatchState) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetStopWatchState setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetStopWatchState set(String parameterName, Object value) {
      return (GetStopWatchState) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertStopWatchState".
   *
   * This request holds the parameters needed by the the stopwatchstateendpoint server.  After setting
   * any optional parameters, call the {@link InsertStopWatchState#execute()} method to invoke the
   * remote operation.
   *
   * @param content the {@link com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState}
   * @return the request
   */
  public InsertStopWatchState insertStopWatchState(com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState content) throws java.io.IOException {
    InsertStopWatchState result = new InsertStopWatchState(content);
    initialize(result);
    return result;
  }

  public class InsertStopWatchState extends StopwatchstateendpointRequest<com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState> {

    private static final String REST_PATH = "stopwatchstate";

    /**
     * Create a request for the method "insertStopWatchState".
     *
     * This request holds the parameters needed by the the stopwatchstateendpoint server.  After
     * setting any optional parameters, call the {@link InsertStopWatchState#execute()} method to
     * invoke the remote operation. <p> {@link InsertStopWatchState#initialize(com.google.api.client.g
     * oogleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState}
     * @since 1.13
     */
    protected InsertStopWatchState(com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState content) {
      super(Stopwatchstateendpoint.this, "POST", REST_PATH, content, com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState.class);
    }

    @Override
    public InsertStopWatchState setAlt(java.lang.String alt) {
      return (InsertStopWatchState) super.setAlt(alt);
    }

    @Override
    public InsertStopWatchState setFields(java.lang.String fields) {
      return (InsertStopWatchState) super.setFields(fields);
    }

    @Override
    public InsertStopWatchState setKey(java.lang.String key) {
      return (InsertStopWatchState) super.setKey(key);
    }

    @Override
    public InsertStopWatchState setOauthToken(java.lang.String oauthToken) {
      return (InsertStopWatchState) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertStopWatchState setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertStopWatchState) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertStopWatchState setQuotaUser(java.lang.String quotaUser) {
      return (InsertStopWatchState) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertStopWatchState setUserIp(java.lang.String userIp) {
      return (InsertStopWatchState) super.setUserIp(userIp);
    }

    @Override
    public InsertStopWatchState set(String parameterName, Object value) {
      return (InsertStopWatchState) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listStopWatchState".
   *
   * This request holds the parameters needed by the the stopwatchstateendpoint server.  After setting
   * any optional parameters, call the {@link ListStopWatchState#execute()} method to invoke the
   * remote operation.
   *
   * @return the request
   */
  public ListStopWatchState listStopWatchState() throws java.io.IOException {
    ListStopWatchState result = new ListStopWatchState();
    initialize(result);
    return result;
  }

  public class ListStopWatchState extends StopwatchstateendpointRequest<com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.CollectionResponseStopWatchState> {

    private static final String REST_PATH = "stopwatchstate";

    /**
     * Create a request for the method "listStopWatchState".
     *
     * This request holds the parameters needed by the the stopwatchstateendpoint server.  After
     * setting any optional parameters, call the {@link ListStopWatchState#execute()} method to invoke
     * the remote operation. <p> {@link ListStopWatchState#initialize(com.google.api.client.googleapis
     * .services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListStopWatchState() {
      super(Stopwatchstateendpoint.this, "GET", REST_PATH, null, com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.CollectionResponseStopWatchState.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListStopWatchState setAlt(java.lang.String alt) {
      return (ListStopWatchState) super.setAlt(alt);
    }

    @Override
    public ListStopWatchState setFields(java.lang.String fields) {
      return (ListStopWatchState) super.setFields(fields);
    }

    @Override
    public ListStopWatchState setKey(java.lang.String key) {
      return (ListStopWatchState) super.setKey(key);
    }

    @Override
    public ListStopWatchState setOauthToken(java.lang.String oauthToken) {
      return (ListStopWatchState) super.setOauthToken(oauthToken);
    }

    @Override
    public ListStopWatchState setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListStopWatchState) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListStopWatchState setQuotaUser(java.lang.String quotaUser) {
      return (ListStopWatchState) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListStopWatchState setUserIp(java.lang.String userIp) {
      return (ListStopWatchState) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListStopWatchState setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListStopWatchState setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListStopWatchState set(String parameterName, Object value) {
      return (ListStopWatchState) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeStopWatchState".
   *
   * This request holds the parameters needed by the the stopwatchstateendpoint server.  After setting
   * any optional parameters, call the {@link RemoveStopWatchState#execute()} method to invoke the
   * remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveStopWatchState removeStopWatchState(java.lang.Long id) throws java.io.IOException {
    RemoveStopWatchState result = new RemoveStopWatchState(id);
    initialize(result);
    return result;
  }

  public class RemoveStopWatchState extends StopwatchstateendpointRequest<com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState> {

    private static final String REST_PATH = "stopwatchstate/{id}";

    /**
     * Create a request for the method "removeStopWatchState".
     *
     * This request holds the parameters needed by the the stopwatchstateendpoint server.  After
     * setting any optional parameters, call the {@link RemoveStopWatchState#execute()} method to
     * invoke the remote operation. <p> {@link RemoveStopWatchState#initialize(com.google.api.client.g
     * oogleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveStopWatchState(java.lang.Long id) {
      super(Stopwatchstateendpoint.this, "DELETE", REST_PATH, null, com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveStopWatchState setAlt(java.lang.String alt) {
      return (RemoveStopWatchState) super.setAlt(alt);
    }

    @Override
    public RemoveStopWatchState setFields(java.lang.String fields) {
      return (RemoveStopWatchState) super.setFields(fields);
    }

    @Override
    public RemoveStopWatchState setKey(java.lang.String key) {
      return (RemoveStopWatchState) super.setKey(key);
    }

    @Override
    public RemoveStopWatchState setOauthToken(java.lang.String oauthToken) {
      return (RemoveStopWatchState) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveStopWatchState setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveStopWatchState) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveStopWatchState setQuotaUser(java.lang.String quotaUser) {
      return (RemoveStopWatchState) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveStopWatchState setUserIp(java.lang.String userIp) {
      return (RemoveStopWatchState) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveStopWatchState setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveStopWatchState set(String parameterName, Object value) {
      return (RemoveStopWatchState) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateStopWatchState".
   *
   * This request holds the parameters needed by the the stopwatchstateendpoint server.  After setting
   * any optional parameters, call the {@link UpdateStopWatchState#execute()} method to invoke the
   * remote operation.
   *
   * @param content the {@link com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState}
   * @return the request
   */
  public UpdateStopWatchState updateStopWatchState(com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState content) throws java.io.IOException {
    UpdateStopWatchState result = new UpdateStopWatchState(content);
    initialize(result);
    return result;
  }

  public class UpdateStopWatchState extends StopwatchstateendpointRequest<com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState> {

    private static final String REST_PATH = "stopwatchstate";

    /**
     * Create a request for the method "updateStopWatchState".
     *
     * This request holds the parameters needed by the the stopwatchstateendpoint server.  After
     * setting any optional parameters, call the {@link UpdateStopWatchState#execute()} method to
     * invoke the remote operation. <p> {@link UpdateStopWatchState#initialize(com.google.api.client.g
     * oogleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState}
     * @since 1.13
     */
    protected UpdateStopWatchState(com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState content) {
      super(Stopwatchstateendpoint.this, "PUT", REST_PATH, content, com.geekyouup.android.ustopwatch.stopwatchstateendpoint.model.StopWatchState.class);
    }

    @Override
    public UpdateStopWatchState setAlt(java.lang.String alt) {
      return (UpdateStopWatchState) super.setAlt(alt);
    }

    @Override
    public UpdateStopWatchState setFields(java.lang.String fields) {
      return (UpdateStopWatchState) super.setFields(fields);
    }

    @Override
    public UpdateStopWatchState setKey(java.lang.String key) {
      return (UpdateStopWatchState) super.setKey(key);
    }

    @Override
    public UpdateStopWatchState setOauthToken(java.lang.String oauthToken) {
      return (UpdateStopWatchState) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateStopWatchState setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateStopWatchState) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateStopWatchState setQuotaUser(java.lang.String quotaUser) {
      return (UpdateStopWatchState) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateStopWatchState setUserIp(java.lang.String userIp) {
      return (UpdateStopWatchState) super.setUserIp(userIp);
    }

    @Override
    public UpdateStopWatchState set(String parameterName, Object value) {
      return (UpdateStopWatchState) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Stopwatchstateendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Stopwatchstateendpoint}. */
    @Override
    public Stopwatchstateendpoint build() {
      return new Stopwatchstateendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link StopwatchstateendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setStopwatchstateendpointRequestInitializer(
        StopwatchstateendpointRequestInitializer stopwatchstateendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(stopwatchstateendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
