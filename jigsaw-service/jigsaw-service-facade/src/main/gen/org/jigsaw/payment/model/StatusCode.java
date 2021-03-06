// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package org.jigsaw.payment.model;

/**
 * <pre>
 **
 * 状态码
 * </pre>
 *
 * Protobuf enum {@code StatusCode}
 */
public enum StatusCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESS = 0;</code>
   */
  SUCCESS(0),
  /**
   * <pre>
   *通用错误
   * </pre>
   *
   * <code>UNKNOWN = 1;</code>
   */
  UNKNOWN(1),
  /**
   * <code>BAD_DATA_FORMAT = 2;</code>
   */
  BAD_DATA_FORMAT(2),
  /**
   * <code>PERMISSION_DENIED = 3;</code>
   */
  PERMISSION_DENIED(3),
  /**
   * <code>INTERNAL_ERROR = 4;</code>
   */
  INTERNAL_ERROR(4),
  /**
   * <code>DATA_REQUIRED = 5;</code>
   */
  DATA_REQUIRED(5),
  /**
   * <code>LIMIT_REACHED = 6;</code>
   */
  LIMIT_REACHED(6),
  /**
   * <code>QUOTA_REACHED = 7;</code>
   */
  QUOTA_REACHED(7),
  /**
   * <code>INVALID_AUTH = 8;</code>
   */
  INVALID_AUTH(8),
  /**
   * <code>AUTH_EXPIRED = 9;</code>
   */
  AUTH_EXPIRED(9),
  /**
   * <code>DATA_CONFLICT = 10;</code>
   */
  DATA_CONFLICT(10),
  /**
   * <code>ENML_VALIDATION = 11;</code>
   */
  ENML_VALIDATION(11),
  /**
   * <code>SHARD_UNAVAILABLE = 12;</code>
   */
  SHARD_UNAVAILABLE(12),
  /**
   * <code>LEN_TOO_SHORT = 13;</code>
   */
  LEN_TOO_SHORT(13),
  /**
   * <code>LEN_TOO_LONG = 14;</code>
   */
  LEN_TOO_LONG(14),
  /**
   * <code>TOO_FEW = 15;</code>
   */
  TOO_FEW(15),
  /**
   * <code>TOO_MANY = 16;</code>
   */
  TOO_MANY(16),
  /**
   * <code>UNSUPPORTED_OPERATION = 17;</code>
   */
  UNSUPPORTED_OPERATION(17),
  /**
   * <code>TAKEN_DOWN = 18;</code>
   */
  TAKEN_DOWN(18),
  /**
   * <code>RATE_LIMIT_REACHED = 19;</code>
   */
  RATE_LIMIT_REACHED(19),
  /**
   * <code>BUSINESS_SECURITY_LOGIN_REQUIRED = 20;</code>
   */
  BUSINESS_SECURITY_LOGIN_REQUIRED(20),
  /**
   * <code>DEVICE_LIMIT_REACHED = 21;</code>
   */
  DEVICE_LIMIT_REACHED(21),
  /**
   * <pre>
   *优惠券相关错误代码
   * </pre>
   *
   * <code>ERROR_COUPONS_FORMAT_INPUT = 101;</code>
   */
  ERROR_COUPONS_FORMAT_INPUT(101),
  /**
   * <code>ERROR_COUPON_LOCK = 102;</code>
   */
  ERROR_COUPON_LOCK(102),
  /**
   * <code>ERROR_COUPON_USE_EXPIRED = 103;</code>
   */
  ERROR_COUPON_USE_EXPIRED(103),
  /**
   * <code>ERROR_COUPON_USE_UNACTIVATED = 104;</code>
   */
  ERROR_COUPON_USE_UNACTIVATED(104),
  /**
   * <code>ERROR_COUPON_USE_FROZEN = 105;</code>
   */
  ERROR_COUPON_USE_FROZEN(105),
  /**
   * <code>ERROR_COUPON_USE_USED = 106;</code>
   */
  ERROR_COUPON_USE_USED(106),
  /**
   * <code>ERROR_COUPON_USE_LOCKED = 107;</code>
   */
  ERROR_COUPON_USE_LOCKED(107),
  /**
   * <code>ERROR_COUPON_USE_DESTROYED = 108;</code>
   */
  ERROR_COUPON_USE_DESTROYED(108),
  /**
   * <code>ERROR_COUPON_TYPE_CANT_OP = 109;</code>
   */
  ERROR_COUPON_TYPE_CANT_OP(109),
  /**
   * <code>ERROR_COUPON_TYPE_CANT_DIRECT_CONSUME = 110;</code>
   */
  ERROR_COUPON_TYPE_CANT_DIRECT_CONSUME(110),
  /**
   * <code>ERROR_COUPON_USE_UNSTARTED = 111;</code>
   */
  ERROR_COUPON_USE_UNSTARTED(111),
  /**
   * <code>ERROR_ORDER_COUPON_NULL = 112;</code>
   */
  ERROR_ORDER_COUPON_NULL(112),
  /**
   * <code>ERROR_ORDER_COUPON_NOT_ALL_LOCK = 113;</code>
   */
  ERROR_ORDER_COUPON_NOT_ALL_LOCK(113),
  /**
   * <code>ERROR_COUPON_SEND_UNHAND = 114;</code>
   */
  ERROR_COUPON_SEND_UNHAND(114),
  /**
   * <code>ERROR_COUPON_SEND_ACTIVATING = 115;</code>
   */
  ERROR_COUPON_SEND_ACTIVATING(115),
  /**
   * <code>ERROR_COUPON_SEND_DESTROYED = 116;</code>
   */
  ERROR_COUPON_SEND_DESTROYED(116),
  /**
   * <code>ERROR_COUPON_SEND_LOCKED = 117;</code>
   */
  ERROR_COUPON_SEND_LOCKED(117),
  /**
   * <code>ERROR_COUPON_SEND_NO_ENOUGH = 118;</code>
   */
  ERROR_COUPON_SEND_NO_ENOUGH(118),
  /**
   * <code>ERROR_COUPON_SEND_TIME_EXPIRED = 119;</code>
   */
  ERROR_COUPON_SEND_TIME_EXPIRED(119),
  /**
   * <code>ERROR_COUPON_BATCH_UNAVAILABLE = 120;</code>
   */
  ERROR_COUPON_BATCH_UNAVAILABLE(120),
  /**
   * <code>ERROR_ORDER_COUPON_NOT_ALL_VALID = 121;</code>
   */
  ERROR_ORDER_COUPON_NOT_ALL_VALID(121),
  /**
   * <code>ERROR_COUPON_BATCH_SEND_UNAVAILABLE = 122;</code>
   */
  ERROR_COUPON_BATCH_SEND_UNAVAILABLE(122),
  /**
   * <code>ERROR_COUPON_BIND_LIMIT = 123;</code>
   */
  ERROR_COUPON_BIND_LIMIT(123),
  /**
   * <code>ERROR_COUPON_BATCH_NULL = 124;</code>
   */
  ERROR_COUPON_BATCH_NULL(124),
  /**
   * <code>ERROR_COUPON_NULL = 125;</code>
   */
  ERROR_COUPON_NULL(125),
  /**
   * <code>ERROR_COUPON_BIND_NOT_BELONG_PARTNER = 126;</code>
   */
  ERROR_COUPON_BIND_NOT_BELONG_PARTNER(126),
  /**
   * <code>ERROR_COUPON_BIND_IS_SENT = 127;</code>
   */
  ERROR_COUPON_BIND_IS_SENT(127),
  /**
   * <code>ERROR_COUPON_BIND_STATUS_NOT_UNUSED = 128;</code>
   */
  ERROR_COUPON_BIND_STATUS_NOT_UNUSED(128),
  /**
   * <code>ERROR_COUPON_CONSUME_ERROR = 129;</code>
   */
  ERROR_COUPON_CONSUME_ERROR(129),
  /**
   * <code>ERROR_COUPON_BIND_OVER_LIMIT = 130;</code>
   */
  ERROR_COUPON_BIND_OVER_LIMIT(130),
  /**
   * <pre>
   *安全相关的错误
   * </pre>
   *
   * <code>ERROR_PASSWORD_NOT_SET = 201;</code>
   */
  ERROR_PASSWORD_NOT_SET(201),
  /**
   * <code>ERROR_PASSWORD_SAVE_FAIL = 202;</code>
   */
  ERROR_PASSWORD_SAVE_FAIL(202),
  /**
   * <code>ERROR_PASSWORD_INVALID = 203;</code>
   */
  ERROR_PASSWORD_INVALID(203),
  /**
   * <code>ERROR_PASSWORD_FROZEN = 204;</code>
   */
  ERROR_PASSWORD_FROZEN(204),
  /**
   * <code>ERROR_IDCARD_INVALID = 205;</code>
   */
  ERROR_IDCARD_INVALID(205),
  /**
   * <code>ERROR_MOBILE_NOT_SET = 206;</code>
   */
  ERROR_MOBILE_NOT_SET(206),
  /**
   * <code>ERROR_NAME_IDCARD_NOT_MATCH = 207;</code>
   */
  ERROR_NAME_IDCARD_NOT_MATCH(207),
  /**
   * <code>ERROR_ACCOUNT_FROZEN = 208;</code>
   */
  ERROR_ACCOUNT_FROZEN(208),
  /**
   * <code>ERROR_ACCOUNT_INACTIVE = 209;</code>
   */
  ERROR_ACCOUNT_INACTIVE(209),
  /**
   * <code>ERROR_PASSWORD_WRONG = 210;</code>
   */
  ERROR_PASSWORD_WRONG(210),
  /**
   * <pre>
   *账户相关的错误
   * </pre>
   *
   * <code>ERROR_ACCOUNT_UNAVAILABLE = 301;</code>
   */
  ERROR_ACCOUNT_UNAVAILABLE(301),
  /**
   * <pre>
   *账户余额不足
   * </pre>
   *
   * <code>ERROR_ACCOUNT_BALANCE_NOT_ENOUGH = 302;</code>
   */
  ERROR_ACCOUNT_BALANCE_NOT_ENOUGH(302),
  /**
   * <pre>
   *订单相关的错误
   * </pre>
   *
   * <code>ERROR_ORDER_ALREADY_PAID = 401;</code>
   */
  ERROR_ORDER_ALREADY_PAID(401),
  ;

  /**
   * <code>SUCCESS = 0;</code>
   */
  public static final int SUCCESS_VALUE = 0;
  /**
   * <pre>
   *通用错误
   * </pre>
   *
   * <code>UNKNOWN = 1;</code>
   */
  public static final int UNKNOWN_VALUE = 1;
  /**
   * <code>BAD_DATA_FORMAT = 2;</code>
   */
  public static final int BAD_DATA_FORMAT_VALUE = 2;
  /**
   * <code>PERMISSION_DENIED = 3;</code>
   */
  public static final int PERMISSION_DENIED_VALUE = 3;
  /**
   * <code>INTERNAL_ERROR = 4;</code>
   */
  public static final int INTERNAL_ERROR_VALUE = 4;
  /**
   * <code>DATA_REQUIRED = 5;</code>
   */
  public static final int DATA_REQUIRED_VALUE = 5;
  /**
   * <code>LIMIT_REACHED = 6;</code>
   */
  public static final int LIMIT_REACHED_VALUE = 6;
  /**
   * <code>QUOTA_REACHED = 7;</code>
   */
  public static final int QUOTA_REACHED_VALUE = 7;
  /**
   * <code>INVALID_AUTH = 8;</code>
   */
  public static final int INVALID_AUTH_VALUE = 8;
  /**
   * <code>AUTH_EXPIRED = 9;</code>
   */
  public static final int AUTH_EXPIRED_VALUE = 9;
  /**
   * <code>DATA_CONFLICT = 10;</code>
   */
  public static final int DATA_CONFLICT_VALUE = 10;
  /**
   * <code>ENML_VALIDATION = 11;</code>
   */
  public static final int ENML_VALIDATION_VALUE = 11;
  /**
   * <code>SHARD_UNAVAILABLE = 12;</code>
   */
  public static final int SHARD_UNAVAILABLE_VALUE = 12;
  /**
   * <code>LEN_TOO_SHORT = 13;</code>
   */
  public static final int LEN_TOO_SHORT_VALUE = 13;
  /**
   * <code>LEN_TOO_LONG = 14;</code>
   */
  public static final int LEN_TOO_LONG_VALUE = 14;
  /**
   * <code>TOO_FEW = 15;</code>
   */
  public static final int TOO_FEW_VALUE = 15;
  /**
   * <code>TOO_MANY = 16;</code>
   */
  public static final int TOO_MANY_VALUE = 16;
  /**
   * <code>UNSUPPORTED_OPERATION = 17;</code>
   */
  public static final int UNSUPPORTED_OPERATION_VALUE = 17;
  /**
   * <code>TAKEN_DOWN = 18;</code>
   */
  public static final int TAKEN_DOWN_VALUE = 18;
  /**
   * <code>RATE_LIMIT_REACHED = 19;</code>
   */
  public static final int RATE_LIMIT_REACHED_VALUE = 19;
  /**
   * <code>BUSINESS_SECURITY_LOGIN_REQUIRED = 20;</code>
   */
  public static final int BUSINESS_SECURITY_LOGIN_REQUIRED_VALUE = 20;
  /**
   * <code>DEVICE_LIMIT_REACHED = 21;</code>
   */
  public static final int DEVICE_LIMIT_REACHED_VALUE = 21;
  /**
   * <pre>
   *优惠券相关错误代码
   * </pre>
   *
   * <code>ERROR_COUPONS_FORMAT_INPUT = 101;</code>
   */
  public static final int ERROR_COUPONS_FORMAT_INPUT_VALUE = 101;
  /**
   * <code>ERROR_COUPON_LOCK = 102;</code>
   */
  public static final int ERROR_COUPON_LOCK_VALUE = 102;
  /**
   * <code>ERROR_COUPON_USE_EXPIRED = 103;</code>
   */
  public static final int ERROR_COUPON_USE_EXPIRED_VALUE = 103;
  /**
   * <code>ERROR_COUPON_USE_UNACTIVATED = 104;</code>
   */
  public static final int ERROR_COUPON_USE_UNACTIVATED_VALUE = 104;
  /**
   * <code>ERROR_COUPON_USE_FROZEN = 105;</code>
   */
  public static final int ERROR_COUPON_USE_FROZEN_VALUE = 105;
  /**
   * <code>ERROR_COUPON_USE_USED = 106;</code>
   */
  public static final int ERROR_COUPON_USE_USED_VALUE = 106;
  /**
   * <code>ERROR_COUPON_USE_LOCKED = 107;</code>
   */
  public static final int ERROR_COUPON_USE_LOCKED_VALUE = 107;
  /**
   * <code>ERROR_COUPON_USE_DESTROYED = 108;</code>
   */
  public static final int ERROR_COUPON_USE_DESTROYED_VALUE = 108;
  /**
   * <code>ERROR_COUPON_TYPE_CANT_OP = 109;</code>
   */
  public static final int ERROR_COUPON_TYPE_CANT_OP_VALUE = 109;
  /**
   * <code>ERROR_COUPON_TYPE_CANT_DIRECT_CONSUME = 110;</code>
   */
  public static final int ERROR_COUPON_TYPE_CANT_DIRECT_CONSUME_VALUE = 110;
  /**
   * <code>ERROR_COUPON_USE_UNSTARTED = 111;</code>
   */
  public static final int ERROR_COUPON_USE_UNSTARTED_VALUE = 111;
  /**
   * <code>ERROR_ORDER_COUPON_NULL = 112;</code>
   */
  public static final int ERROR_ORDER_COUPON_NULL_VALUE = 112;
  /**
   * <code>ERROR_ORDER_COUPON_NOT_ALL_LOCK = 113;</code>
   */
  public static final int ERROR_ORDER_COUPON_NOT_ALL_LOCK_VALUE = 113;
  /**
   * <code>ERROR_COUPON_SEND_UNHAND = 114;</code>
   */
  public static final int ERROR_COUPON_SEND_UNHAND_VALUE = 114;
  /**
   * <code>ERROR_COUPON_SEND_ACTIVATING = 115;</code>
   */
  public static final int ERROR_COUPON_SEND_ACTIVATING_VALUE = 115;
  /**
   * <code>ERROR_COUPON_SEND_DESTROYED = 116;</code>
   */
  public static final int ERROR_COUPON_SEND_DESTROYED_VALUE = 116;
  /**
   * <code>ERROR_COUPON_SEND_LOCKED = 117;</code>
   */
  public static final int ERROR_COUPON_SEND_LOCKED_VALUE = 117;
  /**
   * <code>ERROR_COUPON_SEND_NO_ENOUGH = 118;</code>
   */
  public static final int ERROR_COUPON_SEND_NO_ENOUGH_VALUE = 118;
  /**
   * <code>ERROR_COUPON_SEND_TIME_EXPIRED = 119;</code>
   */
  public static final int ERROR_COUPON_SEND_TIME_EXPIRED_VALUE = 119;
  /**
   * <code>ERROR_COUPON_BATCH_UNAVAILABLE = 120;</code>
   */
  public static final int ERROR_COUPON_BATCH_UNAVAILABLE_VALUE = 120;
  /**
   * <code>ERROR_ORDER_COUPON_NOT_ALL_VALID = 121;</code>
   */
  public static final int ERROR_ORDER_COUPON_NOT_ALL_VALID_VALUE = 121;
  /**
   * <code>ERROR_COUPON_BATCH_SEND_UNAVAILABLE = 122;</code>
   */
  public static final int ERROR_COUPON_BATCH_SEND_UNAVAILABLE_VALUE = 122;
  /**
   * <code>ERROR_COUPON_BIND_LIMIT = 123;</code>
   */
  public static final int ERROR_COUPON_BIND_LIMIT_VALUE = 123;
  /**
   * <code>ERROR_COUPON_BATCH_NULL = 124;</code>
   */
  public static final int ERROR_COUPON_BATCH_NULL_VALUE = 124;
  /**
   * <code>ERROR_COUPON_NULL = 125;</code>
   */
  public static final int ERROR_COUPON_NULL_VALUE = 125;
  /**
   * <code>ERROR_COUPON_BIND_NOT_BELONG_PARTNER = 126;</code>
   */
  public static final int ERROR_COUPON_BIND_NOT_BELONG_PARTNER_VALUE = 126;
  /**
   * <code>ERROR_COUPON_BIND_IS_SENT = 127;</code>
   */
  public static final int ERROR_COUPON_BIND_IS_SENT_VALUE = 127;
  /**
   * <code>ERROR_COUPON_BIND_STATUS_NOT_UNUSED = 128;</code>
   */
  public static final int ERROR_COUPON_BIND_STATUS_NOT_UNUSED_VALUE = 128;
  /**
   * <code>ERROR_COUPON_CONSUME_ERROR = 129;</code>
   */
  public static final int ERROR_COUPON_CONSUME_ERROR_VALUE = 129;
  /**
   * <code>ERROR_COUPON_BIND_OVER_LIMIT = 130;</code>
   */
  public static final int ERROR_COUPON_BIND_OVER_LIMIT_VALUE = 130;
  /**
   * <pre>
   *安全相关的错误
   * </pre>
   *
   * <code>ERROR_PASSWORD_NOT_SET = 201;</code>
   */
  public static final int ERROR_PASSWORD_NOT_SET_VALUE = 201;
  /**
   * <code>ERROR_PASSWORD_SAVE_FAIL = 202;</code>
   */
  public static final int ERROR_PASSWORD_SAVE_FAIL_VALUE = 202;
  /**
   * <code>ERROR_PASSWORD_INVALID = 203;</code>
   */
  public static final int ERROR_PASSWORD_INVALID_VALUE = 203;
  /**
   * <code>ERROR_PASSWORD_FROZEN = 204;</code>
   */
  public static final int ERROR_PASSWORD_FROZEN_VALUE = 204;
  /**
   * <code>ERROR_IDCARD_INVALID = 205;</code>
   */
  public static final int ERROR_IDCARD_INVALID_VALUE = 205;
  /**
   * <code>ERROR_MOBILE_NOT_SET = 206;</code>
   */
  public static final int ERROR_MOBILE_NOT_SET_VALUE = 206;
  /**
   * <code>ERROR_NAME_IDCARD_NOT_MATCH = 207;</code>
   */
  public static final int ERROR_NAME_IDCARD_NOT_MATCH_VALUE = 207;
  /**
   * <code>ERROR_ACCOUNT_FROZEN = 208;</code>
   */
  public static final int ERROR_ACCOUNT_FROZEN_VALUE = 208;
  /**
   * <code>ERROR_ACCOUNT_INACTIVE = 209;</code>
   */
  public static final int ERROR_ACCOUNT_INACTIVE_VALUE = 209;
  /**
   * <code>ERROR_PASSWORD_WRONG = 210;</code>
   */
  public static final int ERROR_PASSWORD_WRONG_VALUE = 210;
  /**
   * <pre>
   *账户相关的错误
   * </pre>
   *
   * <code>ERROR_ACCOUNT_UNAVAILABLE = 301;</code>
   */
  public static final int ERROR_ACCOUNT_UNAVAILABLE_VALUE = 301;
  /**
   * <pre>
   *账户余额不足
   * </pre>
   *
   * <code>ERROR_ACCOUNT_BALANCE_NOT_ENOUGH = 302;</code>
   */
  public static final int ERROR_ACCOUNT_BALANCE_NOT_ENOUGH_VALUE = 302;
  /**
   * <pre>
   *订单相关的错误
   * </pre>
   *
   * <code>ERROR_ORDER_ALREADY_PAID = 401;</code>
   */
  public static final int ERROR_ORDER_ALREADY_PAID_VALUE = 401;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static StatusCode valueOf(int value) {
    return forNumber(value);
  }

  public static StatusCode forNumber(int value) {
    switch (value) {
      case 0: return SUCCESS;
      case 1: return UNKNOWN;
      case 2: return BAD_DATA_FORMAT;
      case 3: return PERMISSION_DENIED;
      case 4: return INTERNAL_ERROR;
      case 5: return DATA_REQUIRED;
      case 6: return LIMIT_REACHED;
      case 7: return QUOTA_REACHED;
      case 8: return INVALID_AUTH;
      case 9: return AUTH_EXPIRED;
      case 10: return DATA_CONFLICT;
      case 11: return ENML_VALIDATION;
      case 12: return SHARD_UNAVAILABLE;
      case 13: return LEN_TOO_SHORT;
      case 14: return LEN_TOO_LONG;
      case 15: return TOO_FEW;
      case 16: return TOO_MANY;
      case 17: return UNSUPPORTED_OPERATION;
      case 18: return TAKEN_DOWN;
      case 19: return RATE_LIMIT_REACHED;
      case 20: return BUSINESS_SECURITY_LOGIN_REQUIRED;
      case 21: return DEVICE_LIMIT_REACHED;
      case 101: return ERROR_COUPONS_FORMAT_INPUT;
      case 102: return ERROR_COUPON_LOCK;
      case 103: return ERROR_COUPON_USE_EXPIRED;
      case 104: return ERROR_COUPON_USE_UNACTIVATED;
      case 105: return ERROR_COUPON_USE_FROZEN;
      case 106: return ERROR_COUPON_USE_USED;
      case 107: return ERROR_COUPON_USE_LOCKED;
      case 108: return ERROR_COUPON_USE_DESTROYED;
      case 109: return ERROR_COUPON_TYPE_CANT_OP;
      case 110: return ERROR_COUPON_TYPE_CANT_DIRECT_CONSUME;
      case 111: return ERROR_COUPON_USE_UNSTARTED;
      case 112: return ERROR_ORDER_COUPON_NULL;
      case 113: return ERROR_ORDER_COUPON_NOT_ALL_LOCK;
      case 114: return ERROR_COUPON_SEND_UNHAND;
      case 115: return ERROR_COUPON_SEND_ACTIVATING;
      case 116: return ERROR_COUPON_SEND_DESTROYED;
      case 117: return ERROR_COUPON_SEND_LOCKED;
      case 118: return ERROR_COUPON_SEND_NO_ENOUGH;
      case 119: return ERROR_COUPON_SEND_TIME_EXPIRED;
      case 120: return ERROR_COUPON_BATCH_UNAVAILABLE;
      case 121: return ERROR_ORDER_COUPON_NOT_ALL_VALID;
      case 122: return ERROR_COUPON_BATCH_SEND_UNAVAILABLE;
      case 123: return ERROR_COUPON_BIND_LIMIT;
      case 124: return ERROR_COUPON_BATCH_NULL;
      case 125: return ERROR_COUPON_NULL;
      case 126: return ERROR_COUPON_BIND_NOT_BELONG_PARTNER;
      case 127: return ERROR_COUPON_BIND_IS_SENT;
      case 128: return ERROR_COUPON_BIND_STATUS_NOT_UNUSED;
      case 129: return ERROR_COUPON_CONSUME_ERROR;
      case 130: return ERROR_COUPON_BIND_OVER_LIMIT;
      case 201: return ERROR_PASSWORD_NOT_SET;
      case 202: return ERROR_PASSWORD_SAVE_FAIL;
      case 203: return ERROR_PASSWORD_INVALID;
      case 204: return ERROR_PASSWORD_FROZEN;
      case 205: return ERROR_IDCARD_INVALID;
      case 206: return ERROR_MOBILE_NOT_SET;
      case 207: return ERROR_NAME_IDCARD_NOT_MATCH;
      case 208: return ERROR_ACCOUNT_FROZEN;
      case 209: return ERROR_ACCOUNT_INACTIVE;
      case 210: return ERROR_PASSWORD_WRONG;
      case 301: return ERROR_ACCOUNT_UNAVAILABLE;
      case 302: return ERROR_ACCOUNT_BALANCE_NOT_ENOUGH;
      case 401: return ERROR_ORDER_ALREADY_PAID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StatusCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
          public StatusCode findValueByNumber(int number) {
            return StatusCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.jigsaw.payment.model.Enums.getDescriptor().getEnumTypes().get(0);
  }

  private static final StatusCode[] VALUES = values();

  public static StatusCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StatusCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:StatusCode)
}

