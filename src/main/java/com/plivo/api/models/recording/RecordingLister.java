package com.plivo.api.models.recording;

import com.plivo.api.models.base.ListResponse;
import com.plivo.api.models.base.VoiceLister;
import com.plivo.api.util.PropertyFilter;
import java.util.Date;
import retrofit2.Call;

public class RecordingLister extends VoiceLister<Recording> {

  private String subaccount;
  private String callUuid;
  private String fromNumber;
  private String toNumber;
  private PropertyFilter<Date> addTime;

  public String subaccount() {
    return this.subaccount;
  }

  public String callUuid() {
    return this.callUuid;
  }

  public String fromNumber() {
    return this.fromNumber;
  }

  public String toNumber() {
    return this.toNumber;
  }

  public PropertyFilter<Date> addTime() {
    return this.addTime;
  }

  /**
   * @param subaccount auth_id of the subaccount. Lists only those recordings of the main accounts
   * which are tied to the specified subaccount.
   */
  public RecordingLister subaccount(final String subaccount) {
    this.subaccount = subaccount;
    return this;
  }

  /**
   * @param fromNumber Used to filter recordings for a specific fromNumber.
   */
  public RecordingLister fromNumber(final String fromNumber) {
    this.fromNumber = fromNumber;
    return this;
  }

  /**
   * @param toNumber Used to filter recordings for a specific toNumber.
   */
  public RecordingLister toNumber(final String toNumber) {
    this.toNumber = toNumber;
    return this;
  }

  /**
   * @param callUuid Used to filter recordings for a specific call.
   */
  public RecordingLister callUuid(final String callUuid) {
    this.callUuid = callUuid;
    return this;
  }

  /**
   * @param addTime Used to filter out recordings according to the time they were added.
   */
  public RecordingLister addTime(final PropertyFilter<Date> addTime) {
    this.addTime = addTime;
    return this;
  }

  @Override
  protected Call<ListResponse<Recording>> obtainCall() {
    return client().getVoiceApiService().recordingList(client().getAuthId(), toMap());
  }

  @Override
  protected Call<ListResponse<Recording>> obtainFallback1Call() {
    return client().getVoiceFallback1Service().recordingList(client().getAuthId(), toMap());
  }

  @Override
  protected Call<ListResponse<Recording>> obtainFallback2Call() {
    return client().getVoiceFallback2Service().recordingList(client().getAuthId(), toMap());
  }
}